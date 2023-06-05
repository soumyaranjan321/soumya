package TEST;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseTest 
{
	public WebDriver driver;
	
	@BeforeSuite
	public void tes1()
	{
		Reporter.log("suite executed start", true);
	}
	
	@BeforeClass
	public void base()
	{
		driver = new ChromeDriver();
		driver.get("https://demo.actitime.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	}
	
	@AfterClass
	public void baselast()
	{
		Reporter.log("base executed" , true);
	}
	
	@AfterSuite
	public void test2()
	{
		Reporter.log("suite executed complete", true);
	}
}
