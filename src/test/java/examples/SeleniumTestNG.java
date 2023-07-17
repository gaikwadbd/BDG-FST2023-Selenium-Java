package examples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumTestNG {
    WebDriver driver;
    @BeforeClass(alwaysRun = true)
    public void setup(){
        //install firefox
       System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "NULL");
       WebDriverManager.firefoxdriver().setup();
       driver=new FirefoxDriver();
       driver.get("https://www.training-support.net/");
    }
    @Test (groups = { "All" })
    public void displayTitle(){
        //find the heading on page
        String heading=driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals(heading,"Training Support");
    }
    @AfterClass
    public void tearDown(){
        driver.quit();

    }
    @Test (dependsOnMethods = { "OpenBrowser" })
    public void SignIn() {
        System.out.println("This will execute second (SignIn)");
    }

    @Test (groups = { "All" })
    public void OpenBrowser() {
        System.out.println("This will execute first (Open Browser)");
    }

    @Test (dependsOnMethods = { "SignIn" })
    public void LogOut() {
        System.out.println("This will execute third (Log Out)");
    }

    @Test(priority = 0)
    public void One() {
        System.out.println("This is the Test Case number One");
    }

    @Test(priority = 1)
    public void Two() {
        System.out.println("This is the Test Case number Two");
    }

    @Test(priority = 2)
    public void Three() {
        System.out.println("This is the Test Case number Three");
    }
    @Test(priority = 0)
    public void OneTest() {
        System.out.println("This is the Test Case number One");
    }

    @Test(priority = 1, enabled = false)
    public void TwoTest() {
        System.out.println("This is the Test Case number Two");
    }
}
