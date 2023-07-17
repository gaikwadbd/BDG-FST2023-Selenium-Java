package TestNGPractice.TestNGAnnotation;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.*;
public class DependsOnTestMethod {

        // Consider example flow Login -> Place an Order -> View Order Report -> Logout
        // You need to stop the execution if the login method fails
        // We use 'dependsOnMethods' annotation to inject this dependency

        @Test
        public void setupTestMehod() {
            System.out.println("Starting the application, launch browser and navigate to application URL");
        }

        @Test(dependsOnMethods = "setupTestMehod")
        public void loginTest() {
            System.out.println("Login into application, Navigate to login page, enter credentials and click 'log-in'");
            // if application initialization failed, it makes no sense to search for login
        }

        @Test(dependsOnMethods = "loginTest")
        public void placeOrderTest() {
            System.out.println("Navigate to catalogue and place an order");
            // Place an order only when login is successful
        }

        @Test(dependsOnMethods = "placeOrderTest")
        public void orderDetailsTest() {
            System.out.println("Navigate to orders report page and verify order record exists");

            assertEquals(12, 200, "Wanted Failing this test, the next dependent test will be skipped");
        }

        @Test(dependsOnMethods = "orderDetailsTest")
        public void logOutTest() {
            // This test will be skipped from execution as the dependent test
            // "View_Order_Report_Test" failed
            System.out.println("Logout of the application");

        }

        @Test(dependsOnMethods = "logOutTest", alwaysRun = true)
        public void quitTest() {
            // alwaysRun attribute will make sure to execute this test even if the dependent
            // test 'Logout_Test' execution failed.

            // NOTE: this is not alternative to @AfterClass
            System.out.println("Quit the application"); // Eg: Use driver.quit(); for selenium
        }

        @AfterClass
        public void tearDownTest() {
            // Independent of test executions being pass or fail, this code will help
            // maintain resource memory optimization.
            // Eg: Use driver.quit(); for selenium
            System.out.println("CleanUpCode");
        }

        // HARD Dependency: @Test(dependsOnMethods={"FirstTest"})
        // dependsOnMethods -> determines order of execution and will be skipped if
        // 'FirstTest' Fails

        // SOFT Dependency: @Test(dependsOnMethods={"FirstTest"}, alwaysRun = true)
        // dependsOnMethods -> determines order of execution and 'alwaysRun' will make
        // sure the test runs even if 'FirstTest' failed
    }

