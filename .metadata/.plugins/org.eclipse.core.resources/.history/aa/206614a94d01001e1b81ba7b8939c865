package Generic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestFailure implements ITestListener
{
	public  void onTestFailure(ITestResult result)
	{
		TakesScreenshot ts=(TakesScreenshot)BaseTest.driver;
		File srcFile=ts.getScreenshotAs(OutputType.FILE);
		File destFile= new File("./failedscreenshot/failed.png");
		try
		{
			FileHandler.copy(srcFile,destFile);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	  }

		

}
