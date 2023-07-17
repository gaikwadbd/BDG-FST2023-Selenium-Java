/*
Alchemy FST Batch May2023
Description: Activity7 Open a new browser to https://training-support.net/selenium/drag-drop
Get the title of the page and print it to the console.
On the page, perform:
Find the ball and simulate a click and drag to move it into "Dropzone 1".
Verify that the ball has entered Dropzone 1.
Once verified, move the ball into "Dropzone 2".
Verify that the ball has entered Dropzone 2.
Close the browser.
Auther : Bharat G
Created on : 12/06/2023
*/
package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity7 {
    public static void main(String[] args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        // Create the Actions object
        Actions actions = new Actions(driver);

        // Open the page
        driver.get("https://www.training-support.net/selenium/drag-drop");
        // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());

        // Find the football
        WebElement football = driver.findElement(By.id("draggable"));
        // Find the dropzone1
        WebElement dropzone1 = driver.findElement(By.id("droppable"));
        // Find the dropzone2
        WebElement dropzone2 = driver.findElement(By.id("dropzone2"));

        // Perform drag and drop to dropzone 1
        actions.clickAndHold(football).moveToElement(dropzone1).pause(2000).release().build().perform();
        String message=driver.findElement(By.xpath("//p[text()='Dropped!']")).getText();
        System.out.println(message);
        message=driver.findElement(By.xpath("//div[@id='dropzone2']/p")).getText();
        System.out.println(message);
        // Perform drag and drop to dropzone 2
        actions.dragAndDrop(football, dropzone2).build().perform();
        message=driver.findElement(By.xpath("//p[text()='Dropped!']")).getText();
        System.out.println(message);
        message=driver.findElement(By.xpath("//div[@id='dropzone2']/p")).getText();
        System.out.println(message);
        WebElement element =driver.findElement(By.id("draggable"));
        actions.clickAndHold(football).pause(2000).dragAndDrop(football, dropzone1).build().perform();

        // Close the browser
        //driver.close();
        //driver.quit();
    }
}