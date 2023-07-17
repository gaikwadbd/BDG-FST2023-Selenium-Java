package TestNGPractice.TestNGAnnotation;

import org.testng.annotations.*;
public class BandAClass {


        @BeforeClass
        public void setupBeforeClass() {
            // The annotated method will be run only once before the first test method in
            // the current class is invoked.
            System.out.println("A - setupBeforeClass");
        }

        @Test
        public void BandAClassTest1() {
            System.out.println("B -BandAClassTest1");
        }

        @Test
        public void BandAClassTest2() {
            System.out.println("C - BandAClassTest2");
        }

        @Test
        public void BandAClassTest3() {
            System.out.println("D - BandAClassTest3");
        }

        @AfterClass
        public void tearDownAfterClass() {
            // The annotated method will be run only once after all the test methods in the
            // current class have run.
            System.out.println("E - tearDownAfterClass");
        }

        // On the console you will see the output as "ABCDE" which will help you
        // understand the order in which the tests were executed
    }

