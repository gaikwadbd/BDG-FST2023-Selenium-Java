/*
Alchemy FST Batch May2023
Description: Activity3 Using Xpaths repeat Activity using xpath
Auther : Bharat G
Created on : 12/06/2023
*/
package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args) {
        // Set up Edge driver
        WebDriverManager.edgedriver().setup();
        // Create a new instance of the Edge driver
        WebDriver driver = new EdgeDriver();

        // Open the page
        driver.get("https://www.training-support.net/selenium/login-form");
        // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());

        // Find the username field and enter the username
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
        // Find the password field and enter the password
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
        // Find the login button and click it
        driver.findElement(By.xpath("//button[text()='Log in']")).click();

        // Print the confirmation message
        String message = driver.findElement(By.xpath("//div[@id='action-confirmation']")).getText();
        System.out.println("Login message: " + message);

        // Close the browser
        driver.close();
        driver.quit();
    }
}