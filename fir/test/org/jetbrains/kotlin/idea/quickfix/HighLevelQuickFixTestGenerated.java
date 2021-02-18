/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.quickfix;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@RunWith(JUnit3RunnerWithInners.class)
public class HighLevelQuickFixTestGenerated extends AbstractHighLevelQuickFixTest {
    @TestMetadata("idea/testData/quickfix/lateinit")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Lateinit extends AbstractHighLevelQuickFixTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        @TestMetadata("nullable.kt")
        public void testNullable() throws Exception {
            runTest("idea/testData/quickfix/lateinit/nullable.kt");
        }

        @TestMetadata("val.kt")
        public void testVal() throws Exception {
            runTest("idea/testData/quickfix/lateinit/val.kt");
        }

        @TestMetadata("withGetter.kt")
        public void testWithGetter() throws Exception {
            runTest("idea/testData/quickfix/lateinit/withGetter.kt");
        }

        @TestMetadata("withGetterSetter.kt")
        public void testWithGetterSetter() throws Exception {
            runTest("idea/testData/quickfix/lateinit/withGetterSetter.kt");
        }

        @TestMetadata("withInitializer.kt")
        public void testWithInitializer() throws Exception {
            runTest("idea/testData/quickfix/lateinit/withInitializer.kt");
        }

        @TestMetadata("withSetter.kt")
        public void testWithSetter() throws Exception {
            runTest("idea/testData/quickfix/lateinit/withSetter.kt");
        }
    }

    @TestMetadata("idea/testData/quickfix/modifiers")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Modifiers extends AbstractHighLevelQuickFixTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        @TestMetadata("abstractModifierInEnum.kt")
        public void testAbstractModifierInEnum() throws Exception {
            runTest("idea/testData/quickfix/modifiers/abstractModifierInEnum.kt");
        }

        @TestMetadata("addLateinit.kt")
        public void testAddLateinit() throws Exception {
            runTest("idea/testData/quickfix/modifiers/addLateinit.kt");
        }

        @TestMetadata("cannotMakeClassAnnotation.kt")
        public void testCannotMakeClassAnnotation() throws Exception {
            runTest("idea/testData/quickfix/modifiers/cannotMakeClassAnnotation.kt");
        }

        @TestMetadata("finalTrait.kt")
        public void testFinalTrait() throws Exception {
            runTest("idea/testData/quickfix/modifiers/finalTrait.kt");
        }

        @TestMetadata("illegalEnumAnnotation1.kt")
        public void testIllegalEnumAnnotation1() throws Exception {
            runTest("idea/testData/quickfix/modifiers/illegalEnumAnnotation1.kt");
        }

        @TestMetadata("illegalEnumAnnotation2.kt")
        public void testIllegalEnumAnnotation2() throws Exception {
            runTest("idea/testData/quickfix/modifiers/illegalEnumAnnotation2.kt");
        }

        @TestMetadata("infixModifier.kt")
        public void testInfixModifier() throws Exception {
            runTest("idea/testData/quickfix/modifiers/infixModifier.kt");
        }

        @TestMetadata("kt10409.kt")
        public void testKt10409() throws Exception {
            runTest("idea/testData/quickfix/modifiers/kt10409.kt");
        }

        @TestMetadata("nestedAbstractClass.kt")
        public void testNestedAbstractClass() throws Exception {
            runTest("idea/testData/quickfix/modifiers/nestedAbstractClass.kt");
        }

        @TestMetadata("nestedAnnotationClass.kt")
        public void testNestedAnnotationClass() throws Exception {
            runTest("idea/testData/quickfix/modifiers/nestedAnnotationClass.kt");
        }

        @TestMetadata("nestedClassNotAllowed.kt")
        public void testNestedClassNotAllowed() throws Exception {
            runTest("idea/testData/quickfix/modifiers/nestedClassNotAllowed.kt");
        }

        @TestMetadata("nestedDataClass.kt")
        public void testNestedDataClass() throws Exception {
            runTest("idea/testData/quickfix/modifiers/nestedDataClass.kt");
        }

        @TestMetadata("nestedEnumClass.kt")
        public void testNestedEnumClass() throws Exception {
            runTest("idea/testData/quickfix/modifiers/nestedEnumClass.kt");
        }

        @TestMetadata("nestedInterface.kt")
        public void testNestedInterface() throws Exception {
            runTest("idea/testData/quickfix/modifiers/nestedInterface.kt");
        }

        @TestMetadata("nestedObject.kt")
        public void testNestedObject() throws Exception {
            runTest("idea/testData/quickfix/modifiers/nestedObject.kt");
        }

        @TestMetadata("nestedSealedClass.kt")
        public void testNestedSealedClass() throws Exception {
            runTest("idea/testData/quickfix/modifiers/nestedSealedClass.kt");
        }

        @TestMetadata("noAbstractForAnonymousObject.kt")
        public void testNoAbstractForAnonymousObject() throws Exception {
            runTest("idea/testData/quickfix/modifiers/noAbstractForAnonymousObject.kt");
        }

        @TestMetadata("noAbstractForObject.kt")
        public void testNoAbstractForObject() throws Exception {
            runTest("idea/testData/quickfix/modifiers/noAbstractForObject.kt");
        }

        @TestMetadata("noLateinitOnNullable.kt")
        public void testNoLateinitOnNullable() throws Exception {
            runTest("idea/testData/quickfix/modifiers/noLateinitOnNullable.kt");
        }

        @TestMetadata("noLateinitOnPrimitive.kt")
        public void testNoLateinitOnPrimitive() throws Exception {
            runTest("idea/testData/quickfix/modifiers/noLateinitOnPrimitive.kt");
        }

        @TestMetadata("notAnAnnotationClass.kt")
        public void testNotAnAnnotationClass() throws Exception {
            runTest("idea/testData/quickfix/modifiers/notAnAnnotationClass.kt");
        }

        @TestMetadata("openCompanionObject.kt")
        public void testOpenCompanionObject() throws Exception {
            runTest("idea/testData/quickfix/modifiers/openCompanionObject.kt");
        }

        @TestMetadata("openCompanionObject2.kt")
        public void testOpenCompanionObject2() throws Exception {
            runTest("idea/testData/quickfix/modifiers/openCompanionObject2.kt");
        }

        @TestMetadata("openMemberInFinalClass1.kt")
        public void testOpenMemberInFinalClass1() throws Exception {
            runTest("idea/testData/quickfix/modifiers/openMemberInFinalClass1.kt");
        }

        @TestMetadata("openMemberInFinalClass2.kt")
        public void testOpenMemberInFinalClass2() throws Exception {
            runTest("idea/testData/quickfix/modifiers/openMemberInFinalClass2.kt");
        }

        @TestMetadata("openMemberInFinalClass3.kt")
        public void testOpenMemberInFinalClass3() throws Exception {
            runTest("idea/testData/quickfix/modifiers/openMemberInFinalClass3.kt");
        }

        @TestMetadata("openMemberInFinalClass4.kt")
        public void testOpenMemberInFinalClass4() throws Exception {
            runTest("idea/testData/quickfix/modifiers/openMemberInFinalClass4.kt");
        }

        @TestMetadata("openModifierInEnum.kt")
        public void testOpenModifierInEnum() throws Exception {
            runTest("idea/testData/quickfix/modifiers/openModifierInEnum.kt");
        }

        @TestMetadata("openObject.kt")
        public void testOpenObject() throws Exception {
            runTest("idea/testData/quickfix/modifiers/openObject.kt");
        }

        @TestMetadata("openVarWithPrivateSetter.kt")
        public void testOpenVarWithPrivateSetter() throws Exception {
            runTest("idea/testData/quickfix/modifiers/openVarWithPrivateSetter.kt");
        }

        @TestMetadata("operatorModifier.kt")
        public void testOperatorModifier() throws Exception {
            runTest("idea/testData/quickfix/modifiers/operatorModifier.kt");
        }

        @TestMetadata("operatorModifierCollection.kt")
        public void testOperatorModifierCollection() throws Exception {
            runTest("idea/testData/quickfix/modifiers/operatorModifierCollection.kt");
        }

        @TestMetadata("operatorModifierComponent.kt")
        public void testOperatorModifierComponent() throws Exception {
            runTest("idea/testData/quickfix/modifiers/operatorModifierComponent.kt");
        }

        @TestMetadata("operatorModifierGet.kt")
        public void testOperatorModifierGet() throws Exception {
            runTest("idea/testData/quickfix/modifiers/operatorModifierGet.kt");
        }

        @TestMetadata("operatorModifierInherited.kt")
        public void testOperatorModifierInherited() throws Exception {
            runTest("idea/testData/quickfix/modifiers/operatorModifierInherited.kt");
        }

        @TestMetadata("overrideWithPrivateSetter.kt")
        public void testOverrideWithPrivateSetter() throws Exception {
            runTest("idea/testData/quickfix/modifiers/overrideWithPrivateSetter.kt");
        }

        @TestMetadata("packageMemberCannotBeProtected.kt")
        public void testPackageMemberCannotBeProtected() throws Exception {
            runTest("idea/testData/quickfix/modifiers/packageMemberCannotBeProtected.kt");
        }

        @TestMetadata("redundantOpenInInterface.kt")
        public void testRedundantOpenInInterface() throws Exception {
            runTest("idea/testData/quickfix/modifiers/redundantOpenInInterface.kt");
        }

        @TestMetadata("removeAbstractModifier.kt")
        public void testRemoveAbstractModifier() throws Exception {
            runTest("idea/testData/quickfix/modifiers/removeAbstractModifier.kt");
        }

        @TestMetadata("removeConst.kt")
        public void testRemoveConst() throws Exception {
            runTest("idea/testData/quickfix/modifiers/removeConst.kt");
        }

        @TestMetadata("removeIncompatibleModifier.kt")
        public void testRemoveIncompatibleModifier() throws Exception {
            runTest("idea/testData/quickfix/modifiers/removeIncompatibleModifier.kt");
        }

        @TestMetadata("removeInnerForClassInTrait.kt")
        public void testRemoveInnerForClassInTrait() throws Exception {
            runTest("idea/testData/quickfix/modifiers/removeInnerForClassInTrait.kt");
        }

        @TestMetadata("removeModifierFromForbiddenOperatorMod.kt")
        public void testRemoveModifierFromForbiddenOperatorMod() throws Exception {
            runTest("idea/testData/quickfix/modifiers/removeModifierFromForbiddenOperatorMod.kt");
        }

        @TestMetadata("removeModifierFromOperatorMod.kt")
        public void testRemoveModifierFromOperatorMod() throws Exception {
            runTest("idea/testData/quickfix/modifiers/removeModifierFromOperatorMod.kt");
        }

        @TestMetadata("removeModifierFromOperatorModAssign.kt")
        public void testRemoveModifierFromOperatorModAssign() throws Exception {
            runTest("idea/testData/quickfix/modifiers/removeModifierFromOperatorModAssign.kt");
        }

        @TestMetadata("removeProtectedModifier.kt")
        public void testRemoveProtectedModifier() throws Exception {
            runTest("idea/testData/quickfix/modifiers/removeProtectedModifier.kt");
        }

        @TestMetadata("removeRedundantModifier1.kt")
        public void testRemoveRedundantModifier1() throws Exception {
            runTest("idea/testData/quickfix/modifiers/removeRedundantModifier1.kt");
        }

        @TestMetadata("removeRedundantModifier2.kt")
        public void testRemoveRedundantModifier2() throws Exception {
            runTest("idea/testData/quickfix/modifiers/removeRedundantModifier2.kt");
        }

        @TestMetadata("removeRedundantModifier3.kt")
        public void testRemoveRedundantModifier3() throws Exception {
            runTest("idea/testData/quickfix/modifiers/removeRedundantModifier3.kt");
        }

        @TestMetadata("removeSupertype1.kt")
        public void testRemoveSupertype1() throws Exception {
            runTest("idea/testData/quickfix/modifiers/removeSupertype1.kt");
        }

        @TestMetadata("removeSupertype2.kt")
        public void testRemoveSupertype2() throws Exception {
            runTest("idea/testData/quickfix/modifiers/removeSupertype2.kt");
        }

        @TestMetadata("removeSupertype3.kt")
        public void testRemoveSupertype3() throws Exception {
            runTest("idea/testData/quickfix/modifiers/removeSupertype3.kt");
        }

        @TestMetadata("removeSupertype4.kt")
        public void testRemoveSupertype4() throws Exception {
            runTest("idea/testData/quickfix/modifiers/removeSupertype4.kt");
        }

        @TestMetadata("visibilityModifer1.kt")
        public void testVisibilityModifer1() throws Exception {
            runTest("idea/testData/quickfix/modifiers/visibilityModifer1.kt");
        }

        @TestMetadata("visibilityModifer2.kt")
        public void testVisibilityModifer2() throws Exception {
            runTest("idea/testData/quickfix/modifiers/visibilityModifer2.kt");
        }

        @TestMetadata("visibilityModiferOverrideJavaRuntime.kt")
        public void testVisibilityModiferOverrideJavaRuntime() throws Exception {
            runTest("idea/testData/quickfix/modifiers/visibilityModiferOverrideJavaRuntime.kt");
        }

        @TestMetadata("visibilityModiferParameter.kt")
        public void testVisibilityModiferParameter() throws Exception {
            runTest("idea/testData/quickfix/modifiers/visibilityModiferParameter.kt");
        }

        @TestMetadata("withAnnotationAndBlockComment.kt")
        public void testWithAnnotationAndBlockComment() throws Exception {
            runTest("idea/testData/quickfix/modifiers/withAnnotationAndBlockComment.kt");
        }

        @TestMetadata("withAnnotationAndEolComment.kt")
        public void testWithAnnotationAndEolComment() throws Exception {
            runTest("idea/testData/quickfix/modifiers/withAnnotationAndEolComment.kt");
        }

        @TestMetadata("withAnnotationAndEolComment2.kt")
        public void testWithAnnotationAndEolComment2() throws Exception {
            runTest("idea/testData/quickfix/modifiers/withAnnotationAndEolComment2.kt");
        }

        @TestMetadata("withAnnotationAndEolComment3.kt")
        public void testWithAnnotationAndEolComment3() throws Exception {
            runTest("idea/testData/quickfix/modifiers/withAnnotationAndEolComment3.kt");
        }
    }

    @TestMetadata("idea/testData/quickfix/override/typeMismatchOnOverride")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class TypeMismatchOnOverride extends AbstractHighLevelQuickFixTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        @TestMetadata("cantChangeMultipleOverriddenPropertiesTypes.kt")
        public void testCantChangeMultipleOverriddenPropertiesTypes() throws Exception {
            runTest("idea/testData/quickfix/override/typeMismatchOnOverride/cantChangeMultipleOverriddenPropertiesTypes.kt");
        }

        @TestMetadata("cantChangeOverriddenPropertyTypeToMatchOverridingProperty.kt")
        public void testCantChangeOverriddenPropertyTypeToMatchOverridingProperty() throws Exception {
            runTest("idea/testData/quickfix/override/typeMismatchOnOverride/cantChangeOverriddenPropertyTypeToMatchOverridingProperty.kt");
        }

        @TestMetadata("cantChangePropertyTypeToMatchOverridenProperties.kt")
        public void testCantChangePropertyTypeToMatchOverridenProperties() throws Exception {
            runTest("idea/testData/quickfix/override/typeMismatchOnOverride/cantChangePropertyTypeToMatchOverridenProperties.kt");
        }

        @TestMetadata("cantChangeReturnTypeOfOverriddenFunction.kt")
        public void testCantChangeReturnTypeOfOverriddenFunction() throws Exception {
            runTest("idea/testData/quickfix/override/typeMismatchOnOverride/cantChangeReturnTypeOfOverriddenFunction.kt");
        }

        @TestMetadata("changeOverriddenPropertyType1.kt")
        public void testChangeOverriddenPropertyType1() throws Exception {
            runTest("idea/testData/quickfix/override/typeMismatchOnOverride/changeOverriddenPropertyType1.kt");
        }

        @TestMetadata("changeOverriddenPropertyType2.kt")
        public void testChangeOverriddenPropertyType2() throws Exception {
            runTest("idea/testData/quickfix/override/typeMismatchOnOverride/changeOverriddenPropertyType2.kt");
        }

        @TestMetadata("changeOverriddenPropertyTypeFromCtorParameter.kt")
        public void testChangeOverriddenPropertyTypeFromCtorParameter() throws Exception {
            runTest("idea/testData/quickfix/override/typeMismatchOnOverride/changeOverriddenPropertyTypeFromCtorParameter.kt");
        }

        @TestMetadata("changeOverridingCtorParameterType.kt")
        public void testChangeOverridingCtorParameterType() throws Exception {
            runTest("idea/testData/quickfix/override/typeMismatchOnOverride/changeOverridingCtorParameterType.kt");
        }

        @TestMetadata("changeOverridingPropertyTypeToFunctionType.kt")
        public void testChangeOverridingPropertyTypeToFunctionType() throws Exception {
            runTest("idea/testData/quickfix/override/typeMismatchOnOverride/changeOverridingPropertyTypeToFunctionType.kt");
        }

        @TestMetadata("changeReturnTypeOfOverriddenFunction.kt")
        public void testChangeReturnTypeOfOverriddenFunction() throws Exception {
            runTest("idea/testData/quickfix/override/typeMismatchOnOverride/changeReturnTypeOfOverriddenFunction.kt");
        }

        @TestMetadata("namedFunctionReturnOverrideInsideVariableInitializer.kt")
        public void testNamedFunctionReturnOverrideInsideVariableInitializer() throws Exception {
            runTest("idea/testData/quickfix/override/typeMismatchOnOverride/namedFunctionReturnOverrideInsideVariableInitializer.kt");
        }

        @TestMetadata("objectInsideBody.kt")
        public void testObjectInsideBody() throws Exception {
            runTest("idea/testData/quickfix/override/typeMismatchOnOverride/objectInsideBody.kt");
        }

        @TestMetadata("propertyReturnTypeMismatchOnOverride.kt")
        public void testPropertyReturnTypeMismatchOnOverride() throws Exception {
            runTest("idea/testData/quickfix/override/typeMismatchOnOverride/propertyReturnTypeMismatchOnOverride.kt");
        }

        @TestMetadata("propertyTypeMismatchOnOverrideIntLong.kt")
        public void testPropertyTypeMismatchOnOverrideIntLong() throws Exception {
            runTest("idea/testData/quickfix/override/typeMismatchOnOverride/propertyTypeMismatchOnOverrideIntLong.kt");
        }

        @TestMetadata("propertyTypeMismatchOnOverrideIntUnit.kt")
        public void testPropertyTypeMismatchOnOverrideIntUnit() throws Exception {
            runTest("idea/testData/quickfix/override/typeMismatchOnOverride/propertyTypeMismatchOnOverrideIntUnit.kt");
        }

        @TestMetadata("returnTypeMismatchOnMultipleOverride.kt")
        public void testReturnTypeMismatchOnMultipleOverride() throws Exception {
            runTest("idea/testData/quickfix/override/typeMismatchOnOverride/returnTypeMismatchOnMultipleOverride.kt");
        }

        @TestMetadata("returnTypeMismatchOnMultipleOverrideAmbiguity.kt")
        public void testReturnTypeMismatchOnMultipleOverrideAmbiguity() throws Exception {
            runTest("idea/testData/quickfix/override/typeMismatchOnOverride/returnTypeMismatchOnMultipleOverrideAmbiguity.kt");
        }

        @TestMetadata("returnTypeMismatchOnOverrideIntLong.kt")
        public void testReturnTypeMismatchOnOverrideIntLong() throws Exception {
            runTest("idea/testData/quickfix/override/typeMismatchOnOverride/returnTypeMismatchOnOverrideIntLong.kt");
        }

        @TestMetadata("returnTypeMismatchOnOverrideIntUnit.kt")
        public void testReturnTypeMismatchOnOverrideIntUnit() throws Exception {
            runTest("idea/testData/quickfix/override/typeMismatchOnOverride/returnTypeMismatchOnOverrideIntUnit.kt");
        }

        @TestMetadata("returnTypeMismatchOnOverrideUnitInt.kt")
        public void testReturnTypeMismatchOnOverrideUnitInt() throws Exception {
            runTest("idea/testData/quickfix/override/typeMismatchOnOverride/returnTypeMismatchOnOverrideUnitInt.kt");
        }
    }

    @TestMetadata("idea/testData/quickfix/variables/changeMutability")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class ChangeMutability extends AbstractHighLevelQuickFixTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        @TestMetadata("capturedMemberValInitialization.kt")
        public void testCapturedMemberValInitialization() throws Exception {
            runTest("idea/testData/quickfix/variables/changeMutability/capturedMemberValInitialization.kt");
        }

        @TestMetadata("capturedValInitialization.kt")
        public void testCapturedValInitialization() throws Exception {
            runTest("idea/testData/quickfix/variables/changeMutability/capturedValInitialization.kt");
        }

        @TestMetadata("const.kt")
        public void testConst() throws Exception {
            runTest("idea/testData/quickfix/variables/changeMutability/const.kt");
        }

        @TestMetadata("funParameter.kt")
        public void testFunParameter() throws Exception {
            runTest("idea/testData/quickfix/variables/changeMutability/funParameter.kt");
        }

        @TestMetadata("localInGetter.kt")
        public void testLocalInGetter() throws Exception {
            runTest("idea/testData/quickfix/variables/changeMutability/localInGetter.kt");
        }

        @TestMetadata("valOverrideVar.kt")
        public void testValOverrideVar() throws Exception {
            runTest("idea/testData/quickfix/variables/changeMutability/valOverrideVar.kt");
        }

        @TestMetadata("valOverrideVarConstructorParameter.kt")
        public void testValOverrideVarConstructorParameter() throws Exception {
            runTest("idea/testData/quickfix/variables/changeMutability/valOverrideVarConstructorParameter.kt");
        }

        @TestMetadata("valReassignmentLocal.kt")
        public void testValReassignmentLocal() throws Exception {
            runTest("idea/testData/quickfix/variables/changeMutability/valReassignmentLocal.kt");
        }

        @TestMetadata("valReassignmentOuterDecl.kt")
        public void testValReassignmentOuterDecl() throws Exception {
            runTest("idea/testData/quickfix/variables/changeMutability/valReassignmentOuterDecl.kt");
        }

        @TestMetadata("valReassignmentProperty.kt")
        public void testValReassignmentProperty() throws Exception {
            runTest("idea/testData/quickfix/variables/changeMutability/valReassignmentProperty.kt");
        }

        @TestMetadata("valReassignmentPropertyConstructorParameter.kt")
        public void testValReassignmentPropertyConstructorParameter() throws Exception {
            runTest("idea/testData/quickfix/variables/changeMutability/valReassignmentPropertyConstructorParameter.kt");
        }

        @TestMetadata("valWithSetter.kt")
        public void testValWithSetter() throws Exception {
            runTest("idea/testData/quickfix/variables/changeMutability/valWithSetter.kt");
        }

        @TestMetadata("varAnnotationParameter.kt")
        public void testVarAnnotationParameter() throws Exception {
            runTest("idea/testData/quickfix/variables/changeMutability/varAnnotationParameter.kt");
        }
    }
}
