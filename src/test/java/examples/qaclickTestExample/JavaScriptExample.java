package examples.qaclickTestExample;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaScriptExample {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("input.inputs.ui-autocomplete-input")).click();
		driver.findElement(By.cssSelector("input.inputs.ui-autocomplete-input")).sendKeys("United");
		//explicit wait
		WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-1\"]")));
		
		driver.findElement(By.cssSelector("input.inputs.ui-autocomplete-input")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.cssSelector("input.inputs.ui-autocomplete-input")).sendKeys(Keys.ARROW_DOWN);
		String text=driver.findElement(By.cssSelector("input.inputs.ui-autocomplete-input")).getAttribute("value");
		System.out.println(text);
		
		//JavascriptExecutor
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String script="return document.getElementById(\"autocomplete\").value;";
		String ts=(String) js.executeScript(script);
		System.out.println(ts);
		

		
		
		
		
	}

}
