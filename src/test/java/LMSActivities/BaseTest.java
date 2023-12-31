package LMSActivities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {
	private WebDriver driver = null;
	private WebDriverWait wait = null;
	public String marker = "---------------------------------";
	public String contactFullName = "John Doe";
	public String email = "johndoe@gmail.com";
	public String subject = "Login Issue";
	public String message = "Login is not working. Ticket created";
	

	@BeforeMethod
	public void launchBrowser() throws Exception {
		setDriver(lms_selenium_project.Configuration.createChromeDriver());
		wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));
		getDriver().get(lms_selenium_project.Configuration.LMS_URL);
	}

	@AfterMethod
	public void closeBrowser() throws Exception {
		getDriver().quit();
	}

	protected WebDriver getDriver() {
		return driver;
	}

	private void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	protected WebDriverWait getWaiter() {
		return this.wait;
	}

}