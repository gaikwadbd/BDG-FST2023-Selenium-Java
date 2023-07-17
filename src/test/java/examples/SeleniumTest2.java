package examples;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest2 {
    public static void main(String[] args) {
        // Setup the Firefox driver(GeckoDriver)

        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://training-support.net");
        // Close the browser
        // Feel free to comment out the line below
        // so it doesn't close too quickly
        driver.quit();
    }
}