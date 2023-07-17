/*
Alchemy FST Batch May2023
Description: Open a new browser to https://training-support.net/selenium/login-form
Get the title of the page and print it to the console.
Find the username field using any locator and enter "admin" into it.
Find the password field using any locator and enter "password" into it.
Find the "Log in" button using any locator and click it.
Close the browser.
Auther : Bharat G
Created on : 12/06/2023
*/
package activities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Activity2 {
    public static void main(String[] args) {
        // Set up Chrome driver
        WebDriverManager.chromedriver().setup();
        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Open the page
        driver.get("https://www.training-support.net/selenium/login-form");
        // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());

        // Find the username field and enter the username
        driver.findElement(By.id("username")).sendKeys("admin");
        // Find the password field and enter the password
        driver.findElement(By.name("Password")).sendKeys("password");
        // Find the login button and click it
        driver.findElement(By.xpath("//button[@class='ui button']")).click();

        // Print the confirmation message
        String message = driver.findElement(By.id("action-confirmation")).getText();
        Assert.assertEquals(message,"Welcome Back, admin");
        System.out.println("Login message: " + message);
        // Close the browser
       driver.close();
    }
}



