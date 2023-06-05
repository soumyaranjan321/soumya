package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlltheDataofHeader {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com");
		List<WebElement> AlltheDataofHeader=driver.findElements(By.xpath("//table[@id='table1']//tr"));
		System.out.println(AlltheDataofHeader.size());
		for(int i=0;i<AlltheDataofHeader.size();i++)
		{
			System.out.println(AlltheDataofHeader.get(i).getText());
		}
	}
	}


