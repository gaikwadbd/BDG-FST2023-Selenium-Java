package examples.qaclickTestExample;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AddToCart {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        Thread.sleep(3000);
        int j=0;
        String[] vegNames= {"Brocolli","Cauliflower"};
        List<WebElement> itemNames=driver.findElements(By.cssSelector("h4[class='product-name']"));
        for(int i=0;i<itemNames.size();i++)
        {
            String[] nameItem=itemNames.get(i).getText().split("-");
            String trimName=nameItem[0].trim();
            List af=Arrays.asList(vegNames);
            if(af.contains(trimName))
            {
                j++;
                driver.findElements(By.cssSelector("div[class='product-action'] button")).get(i).click();
                if(j==vegNames.length)
                    break;
            }
        }
    }
}