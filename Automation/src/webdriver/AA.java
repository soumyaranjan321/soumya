package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AA 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com");
		WebElement element=driver.findElement(By.xpath("//input[@id='email']"));
		
		element.sendKeys("qspiders");
		String value=element.getAttribute("value");

		for(int i=value.length()-1 ; i>0; i--)
		{
			Thread.sleep(1000);
			char character= value.charAt(i);

			if(character == 'e'|| character=='p') 
			{
				element.sendKeys(Keys.BACK_SPACE);
			}
			else 
			{
				element.sendKeys(Keys.ARROW_LEFT);
			}
		}
	}
}