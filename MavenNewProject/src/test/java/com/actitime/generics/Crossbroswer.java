package com.actitime.generics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class Crossbroswer 
{
	public WebDriver driver;
	@Parameters
	@BeforeClass
	public void setup(String browser)
	{
		if (browser.equalsIgnoreCase("edge"))
		{
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
			driver.get("https://demo.actitime.com");
		}
		
		
		else if(browser.equalsIgnoreCase("chrome"))
		{
			driver= new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
			driver .get("https://demo.actitimr.com");
		}
	}
}
