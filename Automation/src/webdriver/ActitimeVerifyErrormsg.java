package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeVerifyErrormsg {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.actitime.com");
		driver.findElement(By.id("username")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[contains(text(),'Login')])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Types of Work')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Create Type of Work')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("name")).sendKeys("motoocartoon");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@value,'Create Type of Work')]")).click();
		Thread.sleep(2000);
		WebElement mes=driver.findElement(By.xpath("//div[@class='errormsg']"));
		Thread.sleep(2000);
		String mestext=mes.getText();

		if (mestext.contains("There are errors in the fields highlighted in red"))
		{
			System.out.println("mestext is mattched");	
		}
		else
		{
			System.out.println("mestext is not matched");
		}
	}

}
