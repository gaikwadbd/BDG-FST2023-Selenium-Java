package examples.qaclickTestExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/?ext_vrnc=hi&tag=googinkenshoo-21&ascsubtag=_k_Cj0KCQjwu8r4BRCzARIsAA21i_B0d3ai6c-nkneOevFzQqrkJGS2wa7bXnE0dFa9ohS5Y-Eix4tQo7MaAuEtEALw_wcB_k_&ext_vrnc=hi&gclid=Cj0KCQjwu8r4BRCzARIsAA21i_B0d3ai6c-nkneOevFzQqrkJGS2wa7bXnE0dFa9ohS5Y-Eix4tQo7MaAuEtEALw_wcB");
		Actions a=new Actions(driver);
		WebElement tc=driver.findElement(By.id("twotabsearchtextbox"));
		a.moveToElement(tc).click().keyDown(Keys.SHIFT).sendKeys("heyya").build().perform();
		a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).contextClick().build().perform();
	}

}
