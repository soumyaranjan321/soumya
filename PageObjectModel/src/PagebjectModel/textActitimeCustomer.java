package PagebjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class textActitimeCustomer {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		driver.get("https://demo.actitime.com");
		
		Pom_ActitimeLoginPage loginpage=new Pom_ActitimeLoginPage(driver);
		loginpage.loginmethod();
		Pom_actitimeHomePage homepage=new Pom_actitimeHomePage(driver);
		homepage.logoutmethod();
		driver.quit();

	}

}
