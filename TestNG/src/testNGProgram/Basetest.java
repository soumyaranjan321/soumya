package testNGProgram;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class Basetest
{
	public WebDriver driver;
	@BeforeSuite
	public void ExecutionStart()
	{
		Reporter.log("ExecutionStart",true);
	}
	@BeforeClass
	public void Setup()
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.get("httrps://demo.actitime.com");
	}

   @AfterClass
   public void Teardown()
   {
	   
   }
   @AfterSuite
   public void ExecutionComplite()
   {
	   Reporter.log("Execution COmlite",true);
   }
   
	   
   }
   



