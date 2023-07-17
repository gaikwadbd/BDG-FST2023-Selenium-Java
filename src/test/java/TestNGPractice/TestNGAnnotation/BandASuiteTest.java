package TestNGPractice.TestNGAnnotation;
import org.testng.annotations.*;
public class BandASuiteTest {



        //Begin Region Suites
        @BeforeSuite
        public void setupBeforeEachTestSuite() {
            // The annotated method will be run only once before all tests in this suite
            // have run.
          System.out.println("This should execute before all tests in the test suite.");
        }

        @Test
        public void tesSuiteExample()
        {
            System.out.println("This is test Suite Examples");
        }
        @AfterSuite
        public void tearDownAfterEachTestSuite() {
            // The annotated method will be run only once after all tests in this suite have
            // run.
            System.out.println("This should execute after all tests in the test suite.");
        }
        //EndRegion Suites


        //Begin Region

    }

