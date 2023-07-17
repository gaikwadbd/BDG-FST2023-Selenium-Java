package examples.qaclickTestExample;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://the-internet.herokuapp.com/windows");
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		Set<String> id=driver.getWindowHandles();
		Iterator<String> it=id.iterator();
		String parentId=it.next();
		String childId=it.next();
		driver.switchTo().window(childId);
		System.out.println(driver.findElement(By.xpath("//h3[text()='New Window']")).getText());
		driver.switchTo().window(parentId);
		System.out.println(driver.findElement(By.xpath("//h3[text()='Opening a new window']")).getText());
		
	
	}

}
