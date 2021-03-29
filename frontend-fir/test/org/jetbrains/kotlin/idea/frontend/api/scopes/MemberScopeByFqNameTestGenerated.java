/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.frontend.api.scopes;

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
@TestRoot("frontend-fir")
@TestDataPath("$CONTENT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
@TestMetadata("testData/memberScopeByFqName")
public class MemberScopeByFqNameTestGenerated extends AbstractMemberScopeByFqNameTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    @TestMetadata("Int.kt")
    public void testInt() throws Exception {
        runTest("testData/memberScopeByFqName/Int.kt");
    }

    @TestMetadata("java.lang.String.kt")
    public void testJava_lang_String() throws Exception {
        runTest("testData/memberScopeByFqName/java.lang.String.kt");
    }

    @TestMetadata("kotlin.Function2.kt")
    public void testKotlin_Function2() throws Exception {
        runTest("testData/memberScopeByFqName/kotlin.Function2.kt");
    }

    @TestMetadata("MutableList.kt")
    public void testMutableList() throws Exception {
        runTest("testData/memberScopeByFqName/MutableList.kt");
    }
}
