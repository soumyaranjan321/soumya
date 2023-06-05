package webdriver;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeaderOfaWebtable {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.logfile", "./log file/chromelog.txt");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com");
		List<WebElement> allheaders=driver.findElements(By.xpath("//table[@id='table1']/thead//th"));
		System.out.println(allheaders.size());
		for(int i=0;i<allheaders.size();i++)
		{
			System.out.println(allheaders.get(i).getText());
		}
		
		
		
		
		
	}

}




