package examples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) {
        // Open a Web Page
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/tab-opener");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
// Store the handle of the current tab in a variable
// This will help you find the newly opened tab later.
        String parentHandle = driver.getWindowHandle();

// Click on the button that opens a new page in another tab
        driver.findElement(By.id("launcher")).click();

// Wait until there's 2 tabs properly open
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

// Store the handles of all the open tabs in a variable.
// Note: getWindowHandles() will always return a Set.
        Set<String> handles = driver.getWindowHandles();

// Loop through the Set and switch to the window
// whose handle doesn't match the parentHandle
        for (String handle : handles) {
            if (handle != parentHandle) {
                driver.switchTo().window(handle);
                System.out.println(driver.switchTo().window(handle).getTitle());
            }
        }

// Wait for the page to actually load
        wait.until(ExpectedConditions.titleIs("Newtab"));

// The rest of your selenium code goes here
    }
}