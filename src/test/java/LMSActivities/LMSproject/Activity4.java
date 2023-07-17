//Author : Bharat Gaikwad
//Project Description : FST May 2023 -Selenium Automation Project -LMS
//Activity4: Verify the title of the second most popular course Goal: Read the title of the second most popular course on the website and verify the text
//Created on: 16-JUN-2023
//Modified on: 16-JUN-2023

package LMSproject;
import junit.framework.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Activity4 {
    public WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        driver= new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms");
    }

    @Test
    public void VerifySecondMostPopularCourseTitle() {
        String ExpectedTitle = "Email Marketing Strategies";
        String ActualTitle =  driver.findElement(By.xpath("//h3[@class='entry-title' and text()='Email Marketing Strategies']")).getText();
        System.out.println(ActualTitle);
        Assert.assertEquals(ExpectedTitle, ActualTitle);
        if (ActualTitle.equals(ExpectedTitle)){
            System.out.println ("The page matches the expected");
            driver.close();
        }
        else {

            System.out.println ("The page title does not match");
        }
    }
    @AfterMethod
    public void afterMethod() {

        driver.quit();
    }

}
