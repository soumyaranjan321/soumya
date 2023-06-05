package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableButton {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
	WebElement button=driver.findElement(By.id("but1"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	if (button.isEnabled())
	{
		System.out.println("enabled");
	}
	else
	{
		System.out.println("disable");
	
	js.executeScript("arguments[0].click()",button);
	System.out.println("cartoon");
	}
	
	
	
		
	}

}
