//Author : Bharat Gaikwad
//Project Description : FST May 2023 -Selenium Automation Project -LMS
//Activity3: Verify the title of the first info boxGoal: Read the title of the first info box on the website and verify the text
//Created on: 16-JUN-2023
//Modified on: 16-JUN-2023

package LMSproject;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import junit.framework.Assert;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;

public class Activity3 {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void beforeClass() {

        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms/");


    }


    @Test
    public void VerifyTheInfoBoxText() {

        WebElement Element = driver.findElement(By.xpath("(//h3[@class='uagb-ifb-title'])[1]"));

        //This will scroll the page till the element is found
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", Element);

        // driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        // pause execution to make the actions visible
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        String infoboxTitle = Element.getText().strip();
        System.out.println("The first info box title is: " +infoboxTitle);

        Assert.assertEquals("Actionable Training", infoboxTitle);
        System.out.println("Assertion successful, test completed!");

    }

    @AfterClass
    public void afterClass() {

        driver.quit();
    }

}
