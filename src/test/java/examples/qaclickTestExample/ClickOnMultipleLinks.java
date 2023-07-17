package examples.qaclickTestExample;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnMultipleLinks {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		System.out.println(driver.findElements(By.tagName("a")).size());
        WebElement footer=driver.findElement(By.id("gf-BIG"));
        System.out.println(footer.findElements(By.tagName("a")).size());
        WebElement firstColumn=footer.findElement(By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td[1]/ul"));
        System.out.println(firstColumn.findElements(By.tagName("a")).size());
        for(int i=1;i<firstColumn.findElements(By.tagName("a")).size();i++)
        {
        	String hk=Keys.chord(Keys.CONTROL, Keys.ENTER);
        	firstColumn.findElements(By.tagName("a")).get(i).sendKeys(hk);
        	
        }
        Set<String> id=driver.getWindowHandles();
        Iterator<String> it=id.iterator();
        while(it.hasNext())
        {
        	driver.switchTo().window(it.next());
        	System.out.println(driver.getTitle());
        }
        
	}

}
