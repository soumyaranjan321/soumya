package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllColumeDataOfThirdColume {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com");
		List<WebElement> AllColumeDataOfThirdColume=driver.findElements(By.xpath("//table[@id='table1']//tbody/tr/td[3]"));
		System.out.println(AllColumeDataOfThirdColume.size());
		for(int i=0;i<AllColumeDataOfThirdColume.size();i++)
		{
			System.out.println(AllColumeDataOfThirdColume.get(i).getText());
		}
	}

}
