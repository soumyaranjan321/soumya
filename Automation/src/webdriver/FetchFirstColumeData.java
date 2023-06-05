package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchFirstColumeData {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com");
		List<WebElement> Firstcolumerow=driver.findElements(By.xpath("//table[@id='table1']//tbody//td[1]"));
		System.out.println(Firstcolumerow.size());
		for(int i=0;i<Firstcolumerow.size();i++)
		{
			System.out.println(Firstcolumerow.get(i).getText());
		}
	}

}
