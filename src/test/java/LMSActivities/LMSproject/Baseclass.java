package LMSproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class Baseclass {

    private WebDriver driver = null;
    private WebDriverWait wait =null;


    @BeforeMethod
    public void beforeMethod()
    {
        //for chrome driver
        //setDriver(Configuration.createChromeDriver());
        //For Firefox driver
        setDriver(Configurator.createFireFoxDriver());
        setwait(wait);
        wait= new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        Reporter.log("********************************");
        Reporter.log("!!!!!Test Execution Started!!!!");
        Reporter.log("Browser Launched");
        this.getDriver().manage().window().maximize();
        Reporter.log("Browser maximized");
        getDriver().get(Configurator.URL);
        Reporter.log("url '"+Configurator.URL+"' launched in the browser");
    }

    @AfterMethod
    public void afterMethod()
    {
        getDriver().close();
        Reporter.log("Browser Closed");
        Reporter.log("!!!!!Test Execution Ended!!!!");
        Reporter.log("********************************");
    }

    protected WebDriver getDriver()
    {
        return driver;
    }

    private void setDriver(WebDriver driver)
    {

        this.driver=driver;
    }

    protected WebDriverWait getWait()
    {

        return wait;
    }

    private void setwait(WebDriverWait wait)
    {

        this.wait=wait;
    }

}
