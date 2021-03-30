/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.kdoc;

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
@TestMetadata("testData/kdoc/typing")
public class KDocTypingTestGenerated extends AbstractKDocTypingTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    @TestMetadata("closingBracketNotInLink.kt")
    public void testClosingBracketNotInLink() throws Exception {
        runTest("testData/kdoc/typing/closingBracketNotInLink.kt");
    }

    @TestMetadata("closingBracketOvertype.kt")
    public void testClosingBracketOvertype() throws Exception {
        runTest("testData/kdoc/typing/closingBracketOvertype.kt");
    }

    @TestMetadata("closingBracketOvertypeEmpty.kt")
    public void testClosingBracketOvertypeEmpty() throws Exception {
        runTest("testData/kdoc/typing/closingBracketOvertypeEmpty.kt");
    }

    @TestMetadata("closingBracketRefLinkOvertype.kt")
    public void testClosingBracketRefLinkOvertype() throws Exception {
        runTest("testData/kdoc/typing/closingBracketRefLinkOvertype.kt");
    }

    @TestMetadata("closingParenOvertype.kt")
    public void testClosingParenOvertype() throws Exception {
        runTest("testData/kdoc/typing/closingParenOvertype.kt");
    }

    @TestMetadata("openingBracket.kt")
    public void testOpeningBracket() throws Exception {
        runTest("testData/kdoc/typing/openingBracket.kt");
    }

    @TestMetadata("openingBracketRefLink.kt")
    public void testOpeningBracketRefLink() throws Exception {
        runTest("testData/kdoc/typing/openingBracketRefLink.kt");
    }

    @TestMetadata("openingParen.kt")
    public void testOpeningParen() throws Exception {
        runTest("testData/kdoc/typing/openingParen.kt");
    }
}
