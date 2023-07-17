package examples.qaclickTestExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchInIE {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Hemanth\\Downloads\\IEDriverServer_Win32_3.150.1\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.get("https://twitter.com/explore");
		driver.getCurrentUrl();
		driver.getPageSource();
		driver.navigate().back();
		driver.close();

	}

}
