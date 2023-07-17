package examples.qaclickTestExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames {

		public static void main(String[] args) {

			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get("http://the-internet.herokuapp.com");
			driver.findElement(By.cssSelector("a[href*='nested']")).click();
			System.out.println(driver.findElements(By.tagName("frame")).size());
			/*
			 * driver.switchTo().frame(driver.findElement(By.xpath(
			 * "//frame[@name='frame-top']")));
			 * driver.switchTo().frame(driver.findElement(By.xpath(
			 * "//frame[@name='frame-middle']")));
			 */
			driver.switchTo().frame(0);
			driver.switchTo().frame(1);
			System.out.println(driver.findElement(By.id("content")).getText());
			driver.switchTo().defaultContent();
			
}
}
