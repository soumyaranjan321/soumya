package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondcolumeThirdRow {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com");
		List<WebElement> SecondcolumeThirdRow=driver.findElements(By.xpath("//table[@id='table1']//tbody//tr[3]/td[2]"));
		System.out.println(SecondcolumeThirdRow.size());
		for(int i=0;i<SecondcolumeThirdRow.size();i++)
		{
			System.out.println(SecondcolumeThirdRow.get(i).getText());
		}
	}

}
