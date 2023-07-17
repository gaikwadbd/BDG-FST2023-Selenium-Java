package examples.qaclickTestExample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandling {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		WebElement table=driver.findElement(By.xpath("//fieldset/legend/following::table[@id='product']"));
		
		System.out.println(table.findElements(By.tagName("tr")).size());
		System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
		List<WebElement> details=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		System.out.println(details.get(0).getText());
		System.out.println(details.get(1).getText());
		System.out.println(details.get(2).getText());

		/*
		 * int tableRowCount=table.findElements(By.xpath(
		 * "//fieldset/legend/following::table[@id='product']/tbody/tr")).size();
		 * System.out.println(tableRowCount); int
		 * tableColumnCount=table.findElements(By.xpath(
		 * "//fieldset/legend/following::table[@id='product']/tbody/tr/th")).size();
		 * System.out.println(tableColumnCount); table.findElements(By.xpath(
		 * "//fieldset/legend/following::table[@id='product']/tbody/tr/th"));
		 * 
		 */
	}

}
