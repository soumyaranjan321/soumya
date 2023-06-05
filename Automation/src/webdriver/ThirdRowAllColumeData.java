package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThirdRowAllColumeData {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com");
		List<WebElement> ThirdRowAllColumeData=driver.findElements(By.xpath("//table[@id='table1']//tbody//tr[3]/td"));
		System.out.println(ThirdRowAllColumeData.size());
		for(int i=0;i<ThirdRowAllColumeData.size();i++)
		{
			System.out.println(ThirdRowAllColumeData.get(i).getText());
		}
	}

}
