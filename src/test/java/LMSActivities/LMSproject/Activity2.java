//Author : Bharat Gaikwad
//Project Description : FST May 2023 -Selenium Automation Project -LMS
//Activity2:Verify the website heading Goal: Read the heading of the website and verify the text
//Created on: 16-JUN-2023
//Modified on: 16-JUN-2023


package LMSproject;

import org.testng.annotations.Test;
import junit.framework.Assert;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class Activity2 {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open browser
        driver.get("https://alchemy.hguy.co/lms");
    }

    @Test
    public void VerifyTheHeadingText() {
        // Check the title of the page
        String title = driver.getTitle();

        //Print the title of the page
        System.out.println("Page title is: " + title);

        //Assertion for page title
        Assert.assertEquals("Alchemy LMS – An LMS Application", title);

        //Find the heading of the page
        WebElement headingName = driver.findElement(By.className("uagb-ifb-title"));

        //Print title of new page
        System.out.println("Heading of the page is: " + headingName.getText());

        //Assertion for page heading
        Assert.assertEquals(headingName.getText(), "Learn from Industry Experts");

    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }

}
