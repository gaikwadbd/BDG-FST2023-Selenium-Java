package examples.qaclickTestExample;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
public class HRM1Test {
    @Test
    public void verifyTitleofHRMPage() {
        final String sUrl = "http://alchemy.hguy.co/orangehrm";
        //Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        driver.get(sUrl);
        String sTitle = driver.getTitle();
        Assert.assertEquals(sTitle, "OrangeHRM");
        Reporter.log("Website title is OrangeHRM");
        driver.quit();
    }
}