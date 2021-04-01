/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.testFramework

import com.intellij.ide.highlighter.ModuleFileType
import com.intellij.ide.impl.OpenProjectTask
import com.intellij.ide.impl.TrustedProjectSettings
import com.intellij.openapi.application.ApplicationManager
import com.intellij.openapi.application.runWriteAction
import com.intellij.openapi.components.service
import com.intellij.openapi.externalSystem.service.project.manage.ExternalProjectsManagerImpl
import com.intellij.openapi.module.ModuleManager
import com.intellij.openapi.module.ModuleTypeId
import com.intellij.openapi.project.DumbService
import com.intellij.openapi.project.Project
import com.intellij.openapi.project.ex.ProjectManagerEx
import com.intellij.openapi.projectRoots.Sdk
import com.intellij.openapi.roots.ProjectRootManager
import com.intellij.openapi.vcs.changes.ChangeListManager
import com.intellij.openapi.vcs.changes.ChangeListManagerImpl
import com.intellij.openapi.vfs.LocalFileSystem
import com.intellij.openapi.vfs.VfsUtil
import com.intellij.openapi.vfs.VirtualFileManager
import com.intellij.testFramework.PsiTestUtil
import com.intellij.testFramework.UsefulTestCase.assertTrue
import com.intellij.util.ThreeState
import com.intellij.util.io.exists
import org.jetbrains.kotlin.idea.configuration.getModulesWithKotlinFiles
import org.jetbrains.kotlin.idea.perf.Stats.Companion.runAndMeasure
import org.jetbrains.kotlin.idea.perf.util.logMessage
import org.jetbrains.kotlin.idea.project.ResolveElementCache
import org.jetbrains.kotlin.idea.project.getAndCacheLanguageLevelByDependencies
import org.jetbrains.kotlin.idea.test.ConfigLibraryUtil
import java.io.File
import java.nio.file.Paths
import kotlin.test.assertTrue

data class OpenProject(val projectPath: String, val projectName: String, val jdk: Sdk, val projectOpenAction: ProjectOpenAction)

enum class ProjectOpenAction {
    SIMPLE_JAVA_MODULE {
        override fun openProject(projectPath: String, projectName: String, jdk: Sdk): Project {
            val project = ProjectManagerEx.getInstanceEx().loadAndOpenProject(projectPath)!!

            val projectFile = LocalFileSystem.getInstance().refreshAndFindFileByIoFile(File(projectPath))!!

            val modulePath = "$projectPath/$name${ModuleFileType.DOT_DEFAULT_EXTENSION}"
            val srcFile = projectFile.findChild("src")!!

            val module = runWriteAction {
                ProjectRootManager.getInstance(project).projectSdk = jdk

                val module = ModuleManager.getInstance(project).newModule(modulePath, ModuleTypeId.JAVA_MODULE)
                PsiTestUtil.addSourceRoot(module, srcFile)

                module
            }

            ConfigLibraryUtil.configureKotlinRuntimeAndSdk(module, jdk)

            return project
        }
    },

    EXISTING_IDEA_PROJECT {
        override fun openProject(projectPath: String, projectName: String, jdk: Sdk): Project {
            val projectManagerEx = ProjectManagerEx.getInstanceEx()

            val project =
                ProjectManagerEx.getInstanceEx()
                    .openProject(
                        Paths.get(projectPath),
                        OpenProjectTask(projectName = projectName, showWelcomeScreen = false)
                    )
                ?: error("project $projectName at $projectPath is not loaded")

            runWriteAction {
                ProjectRootManager.getInstance(project).projectSdk = jdk
            }

            assertTrue(projectManagerEx.openProject(project), "project $projectName at $projectPath is not opened")

            return project
        }
    },

    GRADLE_PROJECT {
        override fun openProject(projectPath: String, projectName: String, jdk: Sdk): Project {
            check(System.getProperty("org.gradle.native") == "false") {
                "Please specify -Dorg.gradle.native=false due to known Gradle native issue"
            }
            val project =
                ProjectManagerEx.getInstanceEx()
                    .openProject(
                        Paths.get(projectPath),
                        OpenProjectTask(projectName = projectName, isNewProject = true, showWelcomeScreen = false)
                    ) ?: error("project $projectName at $projectPath is not loaded")
            assertTrue(
                !project.isDisposed,
                "Gradle project $projectName at $projectPath is accidentally disposed immediately after import"
            )

            project.service<TrustedProjectSettings>().trustedState = ThreeState.YES

            runWriteAction {
                ProjectRootManager.getInstance(project).projectSdk = jdk
            }

            refreshGradleProject(projectPath, project)

            return project
        }

        private fun refreshGradleProjectIfNeeded(projectPath: String, project: Project) {
            if (listOf("build.gradle.kts", "build.gradle").map { name -> Paths.get(projectPath, name).exists() }
                    .find { e -> e } != true) return

            ExternalProjectsManagerImpl.getInstance(project).setStoreExternally(true)

            refreshGradleProject(projectPath, project)

            dispatchAllInvocationEvents()

            // WARNING: [VD] DO NOT SAVE PROJECT AS IT COULD PERSIST WRONG MODULES INFO

//        runInEdtAndWait {
//            PlatformTestUtil.saveProject(project)
//        }
        }

        override fun postOpenProject(project: Project, openProject: OpenProject) {
            runAndMeasure("refresh gradle project ${openProject.projectName}") {
                refreshGradleProjectIfNeeded(openProject.projectPath, project)
            }

            super.postOpenProject(project, openProject)
        }
    };

    abstract fun openProject(projectPath: String, projectName: String, jdk: Sdk): Project

    open fun postOpenProject(project: Project, openProject: OpenProject) {
        ApplicationManager.getApplication().executeOnPooledThread {
            ResolveElementCache.forceFullAnalysisModeInTests = true
            DumbService.getInstance(project).waitForSmartMode()

            for (module in getModulesWithKotlinFiles(project)) {
                module.getAndCacheLanguageLevelByDependencies()
            }
        }.get()

        val modules = ModuleManager.getInstance(project).modules
        assertTrue("project ${openProject.projectName} has to have at least one module", modules.isNotEmpty())

        logMessage { "modules of ${openProject.projectName}: ${modules.map { m -> m.name }}" }
        project.projectFile?.parent?.let { parent ->
            VfsUtil.markDirtyAndRefresh(false, true, true, parent)
        }

        VirtualFileManager.getInstance().syncRefresh()

        //runWriteAction { project.save() }
    }

    companion object {
        fun openProject(openProject: OpenProject): Project {
            val project = openProject.projectOpenAction.openProject(
                projectPath = openProject.projectPath,
                projectName = openProject.projectName,
                jdk = openProject.jdk
            )

            dispatchAllInvocationEvents()

            runStartupActivities(project)

            logMessage { "project ${openProject.projectName} is ${if (project.isInitialized) "initialized" else "not initialized"}" }

            with(ChangeListManager.getInstance(project) as ChangeListManagerImpl) {
                waitUntilRefreshed()
            }
            return project
        }
    }
}

