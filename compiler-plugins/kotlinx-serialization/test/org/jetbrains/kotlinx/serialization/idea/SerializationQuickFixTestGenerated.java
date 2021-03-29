///*
// * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
// * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
// */
//
//package org.jetbrains.kotlinx.serialization.idea;
//
//import com.intellij.testFramework.TestDataPath;
//import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
//import org.jetbrains.kotlin.test.KotlinTestUtils;
//import org.jetbrains.kotlin.test.util.KtTestUtil;
//import org.jetbrains.kotlin.test.TestMetadata;
//import org.junit.runner.RunWith;
//
//import java.io.File;
//import java.util.regex.Pattern;
//
///** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
//@SuppressWarnings("all")
//@TestMetadata("plugins/kotlin-serialization/kotlin-serialization-ide/testData/quickfix")
//@TestDataPath("$PROJECT_ROOT")
//@RunWith(JUnit3RunnerWithInners.class)
//public class SerializationQuickFixTestGenerated extends AbstractSerializationQuickFixTest {
//    private void runTest(String testDataFilePath) throws Exception {
//        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
//    }
//
//    public void testAllFilesPresentInQuickfix() throws Exception {
//        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("plugins/kotlin-serialization/kotlin-serialization-ide/testData/quickfix"), Pattern.compile("^([\\w\\-_]+)\\.kt$"), null, true);
//    }
//
//    @TestMetadata("DefaultFormat.kt")
//    public void testDefaultFormat() throws Exception {
//        runTest("plugins/kotlin-serialization/kotlin-serialization-ide/testData/quickfix/DefaultFormat.kt");
//    }
//
//    @TestMetadata("DefaultFormatWithAlias.kt")
//    public void testDefaultFormatWithAlias() throws Exception {
//        runTest("plugins/kotlin-serialization/kotlin-serialization-ide/testData/quickfix/DefaultFormatWithAlias.kt");
//    }
//}
