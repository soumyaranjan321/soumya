package POM;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1_Actitime 
{
	public WebDriver driver;
	public JavascriptExecutor js;

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.get("https://demo.actitime.com");
		
		Pom_ActitimeLoginPage log= new Pom_ActitimeLoginPage(driver);
		log.enterUsername();
		log.password();
		log.checkBox();
		log.login();
		Pom_actitimeHomePage home= new Pom_actitimeHomePage(driver);
		Thread.sleep(3000);
		home.clicktask();
		Thread.sleep(3000);
		home.logoutmethod();
		
	}
}
