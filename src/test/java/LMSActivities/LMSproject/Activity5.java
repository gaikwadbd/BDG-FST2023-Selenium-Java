//Author : Bharat Gaikwad
//Project Description : FST May 2023 -Selenium Automation Project -LMS
//Activity5: Navigate to another page Goal: Navigate to the “My Account” page on the site
//Created on: 16-JUN-2023
//Modified on: 16-JUN-2023


package LMSproject;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class Activity5 {

    public WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        driver= new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms");
    }

    @Test
    public void navigateToAccountPageAndVerifyTitleOfPage() {

        driver.findElement(By.linkText("My Account")).click();
        String ActualTitle = driver.getTitle();
        String ExpectedTitle = "My Account – Alchemy LMS";
        System.out.println(ActualTitle);
        if (ActualTitle.equals(ExpectedTitle)) {

            System.out.println("You redirected to My Account Page");
        }
    }
    @AfterMethod
    public void afterMethod() {

        driver.quit();
    }

}
