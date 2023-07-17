package TestNGPractice.TestNGAnnotation;
import org.testng.annotations.*;
public class BandAEachTest {


        // NOTE: To generate XML file, right click on the
        // BeforeTest_AfterTest_Tests.java file in package explorer and TestNG ->
        // Convert to TestNG (I created file 'testng_BeforeAfterTest' using the same)

        @BeforeTest
        public void beforeEachTestDemo() {
            // Executes before all test cases from all classes in XML file

            // You need to run the tests from XML file to utilize this method functionality
            System.out.println("This is beforeEachTestDemo");
        }

        @Test
        public void beforeEachTestDemo1() {
            System.out.println("This is test method: beforeEachTestDemo1");
        }

        @AfterTest
        public void afterTestDemo() {
            // Executes after all test cases from all classes in XML file

            // You need to run the tests from XML file to utilize this method functionality
            System.out.println("This is After test Demo");
        }
    }

