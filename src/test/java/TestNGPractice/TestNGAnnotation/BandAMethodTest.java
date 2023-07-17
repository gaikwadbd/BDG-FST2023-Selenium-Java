package TestNGPractice.TestNGAnnotation;

import org.testng.annotations.*;
public class BandAMethodTest {



        @BeforeMethod
        public void setupBandABeforeEachTestMethod() {
            // The annotated method will be run before each test method.

            System.out.println("Begin Execution - Setup_RunOnceBeforeEachTest");
        }

        @Test
        public void BandABeforeEachTestMethod1() {
            System.out.println("Running Test - BeforeMethod_AfterTest_Test_1");
        }

        @Test
        public void BandABeforeEachTestMethod2() {
            System.out.println("Running Test - BeforeMethod_AfterTest_Test_1");
        }

        @Test
        public void BandABeforeEachTestMethod3() {
            System.out.println("Running Test - BeforeMethod_AfterTest_Test_1");
        }

        @AfterMethod
        public void tearDownBandAAfterEachTestMethod() {
            //The annotated method will be run after each test method.

            System.out.println("End Execution - Setup_RunOnceAfterEachTest");
        }

        /*
         * Test output to see order of execution:
         *
         * Begin Execution - Setup_RunOnceBeforeEachTest Running Test -
         * BeforeMethod_AfterTest_Test_1
         * End Execution - Setup_RunOnceAfterEachTest
         *
         * Begin Execution - Setup_RunOnceBeforeEachTest
         * Running Test - BeforeMethod_AfterTest_Test_1
         * End Execution - Setup_RunOnceAfterEachTest
         *
         * Begin Execution - Setup_RunOnceBeforeEachTest
         * Running Test - BeforeMethod_AfterTest_Test_1
         * End Execution - Setup_RunOnceAfterEachTest
         */
    }

