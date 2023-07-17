package examples.qaclickTestExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchInChrome {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String s=driver.getTitle();
		System.out.println(s);
		driver.get("https://twitter.com/explore");
		driver.getCurrentUrl();
		driver.getPageSource();
		driver.navigate().back();
		driver.close();
		
	}

}
