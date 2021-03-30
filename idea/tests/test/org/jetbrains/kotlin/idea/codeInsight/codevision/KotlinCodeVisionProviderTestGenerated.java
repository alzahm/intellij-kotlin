/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.codeInsight.codevision;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.jetbrains.kotlin.test.TestRoot;
import org.junit.runner.RunWith;

/*
 * This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}.
 * DO NOT MODIFY MANUALLY.
 */
@SuppressWarnings("all")
@TestRoot("idea/tests")
@TestDataPath("$CONTENT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
@TestMetadata("testData/codeInsight/codeVision")
public class KotlinCodeVisionProviderTestGenerated extends AbstractKotlinCodeVisionProviderTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    @TestMetadata("ClassFunctionOverrides.kt")
    public void testClassFunctionOverrides() throws Exception {
        runTest("testData/codeInsight/codeVision/ClassFunctionOverrides.kt");
    }

    @TestMetadata("ClassInheritors.kt")
    public void testClassInheritors() throws Exception {
        runTest("testData/codeInsight/codeVision/ClassInheritors.kt");
    }

    @TestMetadata("ClassMethodUsages.kt")
    public void testClassMethodUsages() throws Exception {
        runTest("testData/codeInsight/codeVision/ClassMethodUsages.kt");
    }

    @TestMetadata("ClassPropertiesOverrides.kt")
    public void testClassPropertiesOverrides() throws Exception {
        runTest("testData/codeInsight/codeVision/ClassPropertiesOverrides.kt");
    }

    @TestMetadata("ClassPropertyUsages.kt")
    public void testClassPropertyUsages() throws Exception {
        runTest("testData/codeInsight/codeVision/ClassPropertyUsages.kt");
    }

    @TestMetadata("ClassUsages.kt")
    public void testClassUsages() throws Exception {
        runTest("testData/codeInsight/codeVision/ClassUsages.kt");
    }

    @TestMetadata("GlobalFunctionUsages.kt")
    public void testGlobalFunctionUsages() throws Exception {
        runTest("testData/codeInsight/codeVision/GlobalFunctionUsages.kt");
    }

    @TestMetadata("InterfaceAbstractMethodImplementation.kt")
    public void testInterfaceAbstractMethodImplementation() throws Exception {
        runTest("testData/codeInsight/codeVision/InterfaceAbstractMethodImplementation.kt");
    }

    @TestMetadata("InterfaceImplementations.kt")
    public void testInterfaceImplementations() throws Exception {
        runTest("testData/codeInsight/codeVision/InterfaceImplementations.kt");
    }

    @TestMetadata("InterfaceMethodUsages.kt")
    public void testInterfaceMethodUsages() throws Exception {
        runTest("testData/codeInsight/codeVision/InterfaceMethodUsages.kt");
    }

    @TestMetadata("InterfaceMethodsOverrides.kt")
    public void testInterfaceMethodsOverrides() throws Exception {
        runTest("testData/codeInsight/codeVision/InterfaceMethodsOverrides.kt");
    }

    @TestMetadata("InterfacePropertiesOverrides.kt")
    public void testInterfacePropertiesOverrides() throws Exception {
        runTest("testData/codeInsight/codeVision/InterfacePropertiesOverrides.kt");
    }

    @TestMetadata("InterfacePropertyUsages.kt")
    public void testInterfacePropertyUsages() throws Exception {
        runTest("testData/codeInsight/codeVision/InterfacePropertyUsages.kt");
    }

    @TestMetadata("InterfaceUsages.kt")
    public void testInterfaceUsages() throws Exception {
        runTest("testData/codeInsight/codeVision/InterfaceUsages.kt");
    }

    @TestMetadata("TooManyUsagesAndInheritors.kt")
    public void testTooManyUsagesAndInheritors() throws Exception {
        runTest("testData/codeInsight/codeVision/TooManyUsagesAndInheritors.kt");
    }

    @TestMetadata("UsagesAndInheritanceTogether.kt")
    public void testUsagesAndInheritanceTogether() throws Exception {
        runTest("testData/codeInsight/codeVision/UsagesAndInheritanceTogether.kt");
    }
}
