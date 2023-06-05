package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandingDynamicWebTable {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/admin");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("demo");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("demo");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.=' Login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.=' Sales']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Orders']")).click();
		 WebElement ipsita=driver.findElement(By.xpath("//td[.='1598']/../td[.='Ipsita Panda']"));
		 String ip=ipsita.getText();
		 System.out.println(ip);
		 WebElement total=driver.findElement(By.xpath("//td[.='1598']/../td[.='$106.00']"));
		 String ttl=total.getText();
		 System.out.println(ttl);
		 WebElement amount=driver.findElement(By.xpath("//td[.='1598']/../td[.='10/05/2023'][1]"));
		 String amt=amount.getText();
		 System.out.println(amt);
		 List<WebElement> allid=driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr/td[2]"));
		 System.out.println(allid.size());
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		for(int i=0;i<allid.size();i++)
		{
			String textofid=allid.get(i).getText();
			if (textofid.equals("1484")) 
			{
				driver.findElement(By.xpath("//td[.='1484']/../td[.='Kato Vasquez']")).click();
			}
		
		else
		{
			WebElement nextLink=driver.findElement(By.xpath("//a[.='>']"));
			
			js.executeScript("arguments[0].click()", nextLink);
					
		}

	}
	
}
}
