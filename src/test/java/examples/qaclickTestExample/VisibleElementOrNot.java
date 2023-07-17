package examples.qaclickTestExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class VisibleElementOrNot {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(5000);
		/*
		 * boolean
		 * s=driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled();
		 * System.out.println(s);
		 * 
		 * driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click(); boolean
		 * d=driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled();
		 * System.out.println(d);
		 */
		
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		if((driver.findElement(By.id("Div1")).getAttribute("style").contains("1")))
				{
			System.out.println("Element is Enabled");
			Assert.assertTrue(true);
				}
		else
		{
			Assert.assertTrue(false);
		}
		
		
	}

}
