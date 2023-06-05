package Assignment4;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Assignment4
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.myntra.com");
	WebElement search = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
	search.sendKeys("Levis");
	List<WebElement> sugg = driver.findElements(By.xpath("//li[contains(text(),'Levis')]"));
	Thread.sleep(2000);
	for(int i=0;i<9;i++)
	{
		Thread.sleep(20-00);
		search.sendKeys(Keys.ARROW_DOWN);
	}
	search.sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[.='Color']/..//div[@class='common-checkboxIndicator'])[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[.='Color']/..//div[@class='common-checkboxIndicator'])[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//img[@title='Levis Men White Sneakers'])[1]")).click();
//	System.out.println(driver.getWindowHandle());
	String title=driver.getTitle();
	//System.out.println(title);
	if(driver.getTitle().contains(title))
	{
		System.out.println("title matched");
	}
	else
	{
		System.out.println("title not matched");
	}
	Thread.sleep(3000);
	Set<String> allwindows=driver.getWindowHandles();
	System.out.println(allwindows.size());
	List<String> list=new ArrayList<>(allwindows);
	System.out.println(list.size());
	for(int i=0;i<list.size();i++)
	{
		driver.switchTo().window(list.get(i));
	}
	
	System.out.println(driver.findElement(By.xpath("(//div[.='4.9'])[1]")).getText());
	Thread.sleep(2000);
	System.out.println(driver.findElement(By.xpath("//strong[contains(text(),'₹')]")).getText());
	Thread.sleep(2000);
	System.out.println(driver.findElement(By.xpath("//span[@class='pdp-discount']")).getText());
	Thread.sleep(2000);
	driver.findElement(By.xpath("//p[.='9']")).click();
	Thread.sleep(2000);
	WebElement title1=driver.findElement(By.xpath("//input[@placeholder='Enter pincode']"));
	Thread.sleep(2000);
	title1.sendKeys("752050");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@value='Check']")).click();
	Thread.sleep(2000);
	String s=title1.getAttribute("value");
	Thread.sleep(2000);
	
	if (s.equals("752050"))
	{
		System.out.println("mattched");
		
	}
	else
	{
	System.out.println("not mattched");
	}
	driver.findElement(By.xpath("//div[contains(text(),'ADD TO BAG')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconBag sprites-headerBag']")).click();
	Thread.sleep(2000);
	WebElement placeOrder=driver.findElement(By.xpath("(//div[.='PLACE ORDER'])[1]"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()", placeOrder);
	driver.close();
	Set<String> allwindows1=driver.getWindowHandles();
	System.out.println(allwindows1.size());
	List<String> list1=new ArrayList<>(allwindows1);
	System.out.println(list1.size());
	for(int i=0;i<list1.size();i--)
	{
		driver.switchTo().window(list1.get(i));
	}
	System.out.println(list1);
	//if (list1.equals(driver.switchTo().window(list1.get(i)))
			{
		
	}
}

}
