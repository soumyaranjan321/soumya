package webdriver;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class methood 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		}		
		//		driver.findElement(By.xpath("//h4[contains(text(),'DEALS ON TOP BRANDS')]/../../..//img[contains()@, 'puma')]"));
		//		
		//		
		//		h4[contains(text(),'DEALS ON TOP BRANDS')]/../../..//img[contains(text(),'')
		//h4[contains(text(),'DEALS ON TOP BRANDS')]/../../..//img

		//driver.get("https://myntra.com");
		//		
		//
		//		driver.get("https://www.wikipedia.com");
		//		WebElement scarchbar= driver.findElement(By.xpath("//input[@autofocus='autofocus']"));
		//		scarchbar.sendKeys("india");
		//		Thread.sleep(1000);
		//		List<WebElement> allsuggestions= driver.findElements(By.xpath("//div[@class='suggestion-text']"));
		//		System.out.println(allsuggestions.size());
		//		Thread.sleep(3000);
		//		allsuggestions.get(2).click();
		//		



		//div[@class="suggestion-text"]




	}
}