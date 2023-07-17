package examples.qaclickTestExample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoibiboCalendarGeneric {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.goibibo.com/");
		driver.findElement(By.cssSelector("input[id='departureCalendar']")).click();
		WebElement monthName=driver.findElement(By.xpath("//div[@class='DayPicker-Month']/div[1]"));

			while(!monthName.getText().contains("December"))
			{
				driver.findElement(By.cssSelector("span.DayPicker-NavButton.DayPicker-NavButton--next")).click();
			}
			List<WebElement> dateCheck= driver.findElements(By.className("calDate"));
			
			for(int i=0;i<dateCheck.size();i++)
			{
				
				String dates=dateCheck.get(i).getText();
				if(dates.equalsIgnoreCase("3"))
				{
					dateCheck.get(i).click();
					break;
				}
				
			
		}
	}
}


