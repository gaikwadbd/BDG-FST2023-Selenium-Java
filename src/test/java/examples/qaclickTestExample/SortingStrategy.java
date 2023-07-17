package examples.qaclickTestExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SortingStrategy {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//*[@id='sortableTable']/thead/tr/th[2]")).click();
		driver.findElement(By.xpath("//*[@id='sortableTable']/thead/tr/th[2]")).click();

		List<WebElement> col = driver.findElements(By.cssSelector("tbody td:nth-child(2)"));
		ArrayList<String> actualList=new ArrayList<String>();
		for (int i = 0; i < col.size(); i++)
		{
			actualList.add(col.get(i).getText());
		}
		ArrayList<String> copiedList=new ArrayList<String>();
		for(int i=0;i<actualList.size();i++)
		{
			copiedList.add(actualList.get(i));
		}
		Collections.sort(copiedList);
		//for desc format
		//Collections.reverse(copiedList);
		for(String s1:actualList)
		{
			System.out.println(s1);
		}
		System.out.println("********************************");
		for(String s2:copiedList)
		{
			System.out.println(s2);
		}
		Assert.assertTrue(actualList.equals(copiedList));

	}

}
