package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchNewmaricValue
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com");
		List<WebElement> FetchNewmaricValue=driver.findElements(By.xpath("//table[@id='table1']//tbody//td[2]"));
		System.out.println(FetchNewmaricValue.size());	
		int sum=0;
		for(int i=0;i<FetchNewmaricValue.size();i++)
		{
			String values=FetchNewmaricValue.get(i).getText();
			sum+=Integer.parseInt(values);
		}
		System.out.println(sum);




	}

}
