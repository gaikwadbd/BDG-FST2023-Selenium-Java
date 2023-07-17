package TestNGPractice.TestNGAnnotation;
import org.testng.annotations.*;
public class BandAGroupTest {

        // NOTE: Run the file BeforeGroups_AfterGroups_Tests.xml to see the output order
        // of execution, the @BeforeGroups and @AfterGroups will execute only for
        // included groups in this class (if they are also included in xml file as well)

        @BeforeGroups(groups = { "Regression" })
        public void setupBandAGroupTest() {
            // The list of groups that this configuration method will run before. This
            // method is guaranteed to run shortly before the first test method that belongs
            // to any of these groups is invoked.

            System.out.println("Setup_ToRunBeforeGroupTests- Login");
        }

        @Test(groups = { "Smoke" })
        public void setupBandAGroupTest1() {
            System.out.println("testMethod1");
        }

        @Test(groups = { "Smoke", "Regression" })
        public void setupBandAGroupTest2() {
            System.out.println("testMethod2");
        }

        @Test(groups = { "Regression" })
        public void setupBandAGroupTest3() {
            System.out.println("testMethod3");
        }

        @Test(groups = { "Regression" })
        public void setupBandAGroupTest4() {
            System.out.println("testMethod4");
        }

        @AfterGroups(groups = { "Regression" })
        public void tearDownBandAGroupTest() {
            // The list of groups that this configuration method will run after. This method
            // is guaranteed to run shortly after the last test method that belongs to any
            // of these groups is invoked.
            System.out.println("Setup_ToRunAfterGroupTests - Logout");
        }
    }

