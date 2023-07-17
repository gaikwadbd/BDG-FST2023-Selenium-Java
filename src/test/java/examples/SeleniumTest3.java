package examples;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest3 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("https://training-support.net");
        System.out.println(driver.getTitle());
        driver.navigate().to("https://www.google.com");
        System.out.println(driver.getTitle());
        driver.close();
        driver.quit();
    }
}
