package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetdataPresentInWebTable {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com");
		List<WebElement> allData=driver.findElements(By.xpath("//table[@id='table1']//tbody/tr//td"));
		for(int i=0;i<allData.size();i++)
		{
			System.out.println(allData.get(i).getText());
		}
		
		
	
		
		
		
		
		}

}
