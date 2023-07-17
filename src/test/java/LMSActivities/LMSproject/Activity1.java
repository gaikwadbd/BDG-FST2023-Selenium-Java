//Author : Bharat Gaikwad
//Project Description : FST May 2023 -Selenium Automation Project -LMS
//Activity1: Verify the website title Goal: Read the title of the website and verify the text
//Created on: 16-JUN-2023
//Modified on: 16-JUN-2023

package LMSproject;

import org.testng.annotations.Test;
import junit.framework.Assert;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.WebDriver;

public class Activity1 {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open browser
        driver.get("https://alchemy.hguy.co/lms");
    }

    @Test
    public void verifyPageTitle() {
        // Check the title of the page
        String title = driver.getTitle();

        //Print the title of the page
        System.out.println("Page title is: " + title);

        //Assertion for page title
        Assert.assertEquals("Alchemy LMS – An LMS Application", title);
    }


    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }

}
