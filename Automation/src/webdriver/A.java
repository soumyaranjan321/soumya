package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com");
		Thread.sleep(1000);
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(1000);		
		String homeTitle=driver.getTitle();
		
		System.out.println(homeTitle);
		if(actualtitle.contains(homeTitle))
		{
			System.out.println(" Matched");
		}
		else
		{
			System.out.println(" Not matched");
		}
	}
}


