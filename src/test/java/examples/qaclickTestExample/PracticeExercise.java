package examples.qaclickTestExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeExercise {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.id("checkBoxOption2")).click();
        String extractText=driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
        System.out.println(extractText);
        Select s=new Select(driver.findElement(By.id("dropdown-class-example")));
        s.selectByVisibleText(extractText);
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys(extractText);
        driver.findElement(By.id("alertbtn")).click();
        String text=driver.switchTo().alert().getText();
        if(text.contains(extractText))
        {
            System.out.println("Extracted test is present");
        }
        else
        {
            System.out.println("Extracted test is not present");
        }


    }

}
