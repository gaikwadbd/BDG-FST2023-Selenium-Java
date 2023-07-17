package examples.qaclickTestExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Cleartrip {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		Select s=new Select(driver.findElement(By.id("Adults")));
		s.selectByIndex(3);
		Select s1=new Select(driver.findElement(By.name("childs")));
		s1.selectByValue("2");
		Select s2=new Select(driver.findElement(By.id("Infants")));
		s2.selectByVisibleText("1");
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active ']")).click();	
		driver.findElement(By.id("MoreOptionsLink")).click();
		driver.findElement(By.name("airline")).sendKeys("Spicejet");
		driver.findElement(By.id("SearchBtn")).click();
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
		
	}

}
