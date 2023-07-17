/*
Alchemy FST May2023
Activity1 Description :
Open a new browser to https://training-support.net.
Get the title of the page and print it to the console.
Find the "About Us" button on the page using it's id.
Click on that button.
Get the title of the new page and print it to the console.
Author: Bharat G
Created on 12/06/2023
 */

package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
    public static void main(String[] args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        // Open the page
        driver.get("https://www.training-support.net");
        // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());
        // Find About Us link using id and click it
        driver.findElement(By.id("about-link")).click();
        // Print the title of the new page
        System.out.println("About page title: " + driver.getTitle());

        // Close the browser
        driver.close();
    }
}
