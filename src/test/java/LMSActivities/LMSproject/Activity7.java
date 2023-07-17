package LMSproject;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import java.awt.List;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebElement;

import static java.io.FileDescriptor.in;

public class Activity7 {

    public WebDriver driver;

    @BeforeMethod
    public void OpenURL() {
        driver= new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms");
    }
    @Test
    public void CalculateCourseNumber() {
        driver.findElement(By.linkText("All Courses")).click();
        java.util.List<WebElement> Courses = driver.findElements(By.xpath("//h3[@class='entry-title']"));
        int i= Courses.size();
        System.out.println("The number of courses available are :" +i);
        System.out.print("The Courses are Offered as Follows:");
        for( WebElement course : Courses ) {

            System.out.print("\n" +course.getText());
        }
    }

   @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
}
