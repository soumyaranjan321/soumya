package PagebjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleText {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		driver.get("https://www.google.com");
		googlePomClass autosuggestions= new googlePomClass(driver);
		autosuggestions.googleSearchbar();
		autosuggestions.googlAutosuggestion();
		}
		

	

	}
