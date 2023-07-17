/*
Alchemy FST Batch May2023
Description: Activity5 Open a new browser to https://www.training-support.net/selenium/input-events
Get the title of the page and print it to the console.
On the page, perform:
Left click and print the value of the side in the front.
Double click to show a random side and print the number.
Right click and print the value shown on the front of the cube.
Close the browser.
Auther : Bharat G
Created on : 12/06/2023
*/
package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity5 {
    public static void main(String[] args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        // Create the Actions object
        Actions actions = new Actions(driver);

        // Open the page
        driver.get("https://www.training-support.net/selenium/input-events");
        // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());

        // Perform left click
        actions.click().pause(1000).build().perform();
        // Print the front side text
        String frontText = driver.findElement(By.className("active")).getText();
        System.out.println(frontText);

        // Perform left click
        actions.doubleClick().pause(1000).build().perform();
        // Print the front side text
        frontText = driver.findElement(By.className("active")).getText();
        System.out.println(frontText);

        // Perform left click
        actions.contextClick().pause(1000).build().perform();
        // Print the front side text
        frontText = driver.findElement(By.className("active")).getText();
        System.out.println(frontText);

        //Key down Press Enter key
        actions.keyDown(Keys.ENTER).build().perform();
        // Print the front side text
        frontText = driver.findElement(By.id("keyPressed")).getText();
        System.out.println(frontText);

        actions.keyDown(Keys.BACK_SPACE).build().perform();
        frontText = driver.findElement(By.id("keyPressed")).getText();
        System.out.println(frontText);
        // Close the browser
        driver.close();
    }
}