/*
 * Copyright 2010-2015 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.jvm.compiler;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.InnerTestClasses;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.JetTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/compileJavaAgainstKotlin")
@TestDataPath("$PROJECT_ROOT")
@InnerTestClasses({
        CompileJavaAgainstKotlinTestGenerated.Class.class,
        CompileJavaAgainstKotlinTestGenerated.Method.class,
        CompileJavaAgainstKotlinTestGenerated.PlatformStatic.class,
        CompileJavaAgainstKotlinTestGenerated.Property.class,
        CompileJavaAgainstKotlinTestGenerated.StaticFields.class,
})
@RunWith(JUnit3RunnerWithInners.class)
public class CompileJavaAgainstKotlinTestGenerated extends AbstractCompileJavaAgainstKotlinTest {
    public void testAllFilesPresentInCompileJavaAgainstKotlin() throws Exception {
        JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/compileJavaAgainstKotlin"), Pattern.compile("^(.+)\\.kt$"), true);
    }

    @TestMetadata("compiler/testData/compileJavaAgainstKotlin/class")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Class extends AbstractCompileJavaAgainstKotlinTest {
        public void testAllFilesPresentInClass() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/compileJavaAgainstKotlin/class"), Pattern.compile("^(.+)\\.kt$"), true);
        }

        @TestMetadata("ClassObject.kt")
        public void testClassObject() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/class/ClassObject.kt");
            doTest(fileName);
        }

        @TestMetadata("DefaultConstructor.kt")
        public void testDefaultConstructor() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/class/DefaultConstructor.kt");
            doTest(fileName);
        }

        @TestMetadata("DefaultConstructorWithTwoArgs.kt")
        public void testDefaultConstructorWithTwoArgs() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/class/DefaultConstructorWithTwoArgs.kt");
            doTest(fileName);
        }

        @TestMetadata("ExtendsAbstractListT.kt")
        public void testExtendsAbstractListT() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/class/ExtendsAbstractListT.kt");
            doTest(fileName);
        }

        @TestMetadata("ImplementsListString.kt")
        public void testImplementsListString() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/class/ImplementsListString.kt");
            doTest(fileName);
        }

        @TestMetadata("ImplementsMapPP.kt")
        public void testImplementsMapPP() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/class/ImplementsMapPP.kt");
            doTest(fileName);
        }

        @TestMetadata("InnerClass.kt")
        public void testInnerClass() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/class/InnerClass.kt");
            doTest(fileName);
        }

        @TestMetadata("InnerClassConstructors.kt")
        public void testInnerClassConstructors() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/class/InnerClassConstructors.kt");
            doTest(fileName);
        }

        @TestMetadata("InnerClassOfGeneric.kt")
        public void testInnerClassOfGeneric() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/class/InnerClassOfGeneric.kt");
            doTest(fileName);
        }

        @TestMetadata("kt3561.kt")
        public void testKt3561() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/class/kt3561.kt");
            doTest(fileName);
        }

        @TestMetadata("kt4050.kt")
        public void testKt4050() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/class/kt4050.kt");
            doTest(fileName);
        }

        @TestMetadata("Simple.kt")
        public void testSimple() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/class/Simple.kt");
            doTest(fileName);
        }

        @TestMetadata("StarProjection.kt")
        public void testStarProjection() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/class/StarProjection.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("compiler/testData/compileJavaAgainstKotlin/method")
    @TestDataPath("$PROJECT_ROOT")
    @InnerTestClasses({
            Method.PlatformName.class,
            Method.PrimitiveOverride.class,
            Method.Throws.class,
    })
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Method extends AbstractCompileJavaAgainstKotlinTest {
        @TestMetadata("AccessorGenericSignature.kt")
        public void testAccessorGenericSignature() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/method/AccessorGenericSignature.kt");
            doTest(fileName);
        }

        public void testAllFilesPresentInMethod() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/compileJavaAgainstKotlin/method"), Pattern.compile("^(.+)\\.kt$"), true);
        }

        @TestMetadata("Any.kt")
        public void testAny() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/method/Any.kt");
            doTest(fileName);
        }

        @TestMetadata("ArrayOfIntArray.kt")
        public void testArrayOfIntArray() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/method/ArrayOfIntArray.kt");
            doTest(fileName);
        }

        @TestMetadata("ArrayOfIntegerArray.kt")
        public void testArrayOfIntegerArray() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/method/ArrayOfIntegerArray.kt");
            doTest(fileName);
        }

        @TestMetadata("ClashingSignaturesWithoutReturnType.kt")
        public void testClashingSignaturesWithoutReturnType() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/method/ClashingSignaturesWithoutReturnType.kt");
            doTest(fileName);
        }

        @TestMetadata("DefaultMethod.kt")
        public void testDefaultMethod() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/method/DefaultMethod.kt");
            doTest(fileName);
        }

        @TestMetadata("Delegation.kt")
        public void testDelegation() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/method/Delegation.kt");
            doTest(fileName);
        }

        @TestMetadata("Extensions.kt")
        public void testExtensions() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/method/Extensions.kt");
            doTest(fileName);
        }

        @TestMetadata("GenericArray.kt")
        public void testGenericArray() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/method/GenericArray.kt");
            doTest(fileName);
        }

        @TestMetadata("Hello.kt")
        public void testHello() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/method/Hello.kt");
            doTest(fileName);
        }

        @TestMetadata("Int.kt")
        public void testInt() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/method/Int.kt");
            doTest(fileName);
        }

        @TestMetadata("IntArray.kt")
        public void testIntArray() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/method/IntArray.kt");
            doTest(fileName);
        }

        @TestMetadata("IntWithDefault.kt")
        public void testIntWithDefault() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/method/IntWithDefault.kt");
            doTest(fileName);
        }

        @TestMetadata("IntegerArray.kt")
        public void testIntegerArray() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/method/IntegerArray.kt");
            doTest(fileName);
        }

        @TestMetadata("ListOfInt.kt")
        public void testListOfInt() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/method/ListOfInt.kt");
            doTest(fileName);
        }

        @TestMetadata("ListOfString.kt")
        public void testListOfString() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/method/ListOfString.kt");
            doTest(fileName);
        }

        @TestMetadata("ListOfT.kt")
        public void testListOfT() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/method/ListOfT.kt");
            doTest(fileName);
        }

        @TestMetadata("MapOfKString.kt")
        public void testMapOfKString() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/method/MapOfKString.kt");
            doTest(fileName);
        }

        @TestMetadata("MapOfStringIntQ.kt")
        public void testMapOfStringIntQ() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/method/MapOfStringIntQ.kt");
            doTest(fileName);
        }

        @TestMetadata("QExtendsListString.kt")
        public void testQExtendsListString() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/method/QExtendsListString.kt");
            doTest(fileName);
        }

        @TestMetadata("QExtendsString.kt")
        public void testQExtendsString() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/method/QExtendsString.kt");
            doTest(fileName);
        }

        @TestMetadata("TraitImpl.kt")
        public void testTraitImpl() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/method/TraitImpl.kt");
            doTest(fileName);
        }

        @TestMetadata("Vararg.kt")
        public void testVararg() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/method/Vararg.kt");
            doTest(fileName);
        }

        @TestMetadata("Void.kt")
        public void testVoid() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/method/Void.kt");
            doTest(fileName);
        }

        @TestMetadata("compiler/testData/compileJavaAgainstKotlin/method/platformName")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class PlatformName extends AbstractCompileJavaAgainstKotlinTest {
            public void testAllFilesPresentInPlatformName() throws Exception {
                JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/compileJavaAgainstKotlin/method/platformName"), Pattern.compile("^(.+)\\.kt$"), true);
            }

            @TestMetadata("PlatformName.kt")
            public void testPlatformName() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/method/platformName/PlatformName.kt");
                doTest(fileName);
            }
        }

        @TestMetadata("compiler/testData/compileJavaAgainstKotlin/method/primitiveOverride")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class PrimitiveOverride extends AbstractCompileJavaAgainstKotlinTest {
            public void testAllFilesPresentInPrimitiveOverride() throws Exception {
                JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/compileJavaAgainstKotlin/method/primitiveOverride"), Pattern.compile("^(.+)\\.kt$"), true);
            }

            @TestMetadata("ByteOverridesObject.kt")
            public void testByteOverridesObject() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/method/primitiveOverride/ByteOverridesObject.kt");
                doTest(fileName);
            }

            @TestMetadata("CallFinalNotInSubclass.kt")
            public void testCallFinalNotInSubclass() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/method/primitiveOverride/CallFinalNotInSubclass.kt");
                doTest(fileName);
            }

            @TestMetadata("CallNotInSubclass.kt")
            public void testCallNotInSubclass() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/method/primitiveOverride/CallNotInSubclass.kt");
                doTest(fileName);
            }

            @TestMetadata("CovariantReturnTypeOverride.kt")
            public void testCovariantReturnTypeOverride() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/method/primitiveOverride/CovariantReturnTypeOverride.kt");
                doTest(fileName);
            }

            @TestMetadata("FinalOverride.kt")
            public void testFinalOverride() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/method/primitiveOverride/FinalOverride.kt");
                doTest(fileName);
            }

            @TestMetadata("IntOverridesComparable.kt")
            public void testIntOverridesComparable() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/method/primitiveOverride/IntOverridesComparable.kt");
                doTest(fileName);
            }

            @TestMetadata("IntOverridesNumber.kt")
            public void testIntOverridesNumber() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/method/primitiveOverride/IntOverridesNumber.kt");
                doTest(fileName);
            }

            @TestMetadata("IntOverridesObject.kt")
            public void testIntOverridesObject() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/method/primitiveOverride/IntOverridesObject.kt");
                doTest(fileName);
            }

            @TestMetadata("ManyClassesHierarchy.kt")
            public void testManyClassesHierarchy() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/method/primitiveOverride/ManyClassesHierarchy.kt");
                doTest(fileName);
            }

            @TestMetadata("NullableIntOverridesObject.kt")
            public void testNullableIntOverridesObject() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/method/primitiveOverride/NullableIntOverridesObject.kt");
                doTest(fileName);
            }

            @TestMetadata("OverrideInJava.kt")
            public void testOverrideInJava() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/method/primitiveOverride/OverrideInJava.kt");
                doTest(fileName);
            }
        }

        @TestMetadata("compiler/testData/compileJavaAgainstKotlin/method/throws")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class Throws extends AbstractCompileJavaAgainstKotlinTest {
            public void testAllFilesPresentInThrows() throws Exception {
                JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/compileJavaAgainstKotlin/method/throws"), Pattern.compile("^(.+)\\.kt$"), true);
            }

            @TestMetadata("ClassMembers.kt")
            public void testClassMembers() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/method/throws/ClassMembers.kt");
                doTest(fileName);
            }

            @TestMetadata("Constructor.kt")
            public void testConstructor() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/method/throws/Constructor.kt");
                doTest(fileName);
            }

            @TestMetadata("DefaultArgs.kt")
            public void testDefaultArgs() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/method/throws/DefaultArgs.kt");
                doTest(fileName);
            }

            @TestMetadata("Delegation.kt")
            public void testDelegation() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/method/throws/Delegation.kt");
                doTest(fileName);
            }

            @TestMetadata("GenericSubstitution.kt")
            public void testGenericSubstitution() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/method/throws/GenericSubstitution.kt");
                doTest(fileName);
            }

            @TestMetadata("TopLevel.kt")
            public void testTopLevel() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/method/throws/TopLevel.kt");
                doTest(fileName);
            }

            @TestMetadata("TraitMembers.kt")
            public void testTraitMembers() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/method/throws/TraitMembers.kt");
                doTest(fileName);
            }
        }
    }

    @TestMetadata("compiler/testData/compileJavaAgainstKotlin/platformStatic")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class PlatformStatic extends AbstractCompileJavaAgainstKotlinTest {
        public void testAllFilesPresentInPlatformStatic() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/compileJavaAgainstKotlin/platformStatic"), Pattern.compile("^(.+)\\.kt$"), true);
        }

        @TestMetadata("simpleClassObject.kt")
        public void testSimpleClassObject() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/platformStatic/simpleClassObject.kt");
            doTest(fileName);
        }

        @TestMetadata("simpleClassObjectProperty.kt")
        public void testSimpleClassObjectProperty() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/platformStatic/simpleClassObjectProperty.kt");
            doTest(fileName);
        }

        @TestMetadata("simpleObject.kt")
        public void testSimpleObject() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/platformStatic/simpleObject.kt");
            doTest(fileName);
        }

        @TestMetadata("simpleObjectProperty.kt")
        public void testSimpleObjectProperty() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/platformStatic/simpleObjectProperty.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("compiler/testData/compileJavaAgainstKotlin/property")
    @TestDataPath("$PROJECT_ROOT")
    @InnerTestClasses({
            Property.PlatformName.class,
    })
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Property extends AbstractCompileJavaAgainstKotlinTest {
        public void testAllFilesPresentInProperty() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/compileJavaAgainstKotlin/property"), Pattern.compile("^(.+)\\.kt$"), true);
        }

        @TestMetadata("Extensions.kt")
        public void testExtensions() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/property/Extensions.kt");
            doTest(fileName);
        }

        @TestMetadata("GenericProperty.kt")
        public void testGenericProperty() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/property/GenericProperty.kt");
            doTest(fileName);
        }

        @TestMetadata("compiler/testData/compileJavaAgainstKotlin/property/platformName")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class PlatformName extends AbstractCompileJavaAgainstKotlinTest {
            public void testAllFilesPresentInPlatformName() throws Exception {
                JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/compileJavaAgainstKotlin/property/platformName"), Pattern.compile("^(.+)\\.kt$"), true);
            }

            @TestMetadata("PlatformName.kt")
            public void testPlatformName() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/property/platformName/PlatformName.kt");
                doTest(fileName);
            }
        }
    }

    @TestMetadata("compiler/testData/compileJavaAgainstKotlin/staticFields")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class StaticFields extends AbstractCompileJavaAgainstKotlinTest {
        public void testAllFilesPresentInStaticFields() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/compileJavaAgainstKotlin/staticFields"), Pattern.compile("^(.+)\\.kt$"), true);
        }

        @TestMetadata("AnnotationClass.kt")
        public void testAnnotationClass() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/staticFields/AnnotationClass.kt");
            doTest(fileName);
        }

        @TestMetadata("AnnotationTrait.kt")
        public void testAnnotationTrait() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/staticFields/AnnotationTrait.kt");
            doTest(fileName);
        }

        @TestMetadata("kt3698.kt")
        public void testKt3698() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/staticFields/kt3698.kt");
            doTest(fileName);
        }

        @TestMetadata("staticClassProperty.kt")
        public void testStaticClassProperty() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/staticFields/staticClassProperty.kt");
            doTest(fileName);
        }

        @TestMetadata("staticTraitProperty.kt")
        public void testStaticTraitProperty() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("compiler/testData/compileJavaAgainstKotlin/staticFields/staticTraitProperty.kt");
            doTest(fileName);
        }
    }
}
