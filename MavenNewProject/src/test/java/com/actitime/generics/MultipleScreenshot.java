package com.actitime.generics;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;

import org.testng.ITestResult;

public class MultipleScreenshot implements ITestListener
{
	public  void onTestFailure(ITestResult result)
	{
		TakesScreenshot ts=(TakesScreenshot)BaseTest.driver;
		File srcFile=ts.getScreenshotAs(OutputType.FILE);
		String methodName=result.getName();
		Date date= Calendar.getInstance().getTime();
		String today=date.toString().replaceAll(":", "_");
		
				
		File destFile = new File("./FailedScreenshot/"+methodName+today+".png");
//		if (result.getStatus()==2)
//		{
//			System.out.println("Testcase is failed");
//			
//		}
		try
		{
			FileHandler.copy(srcFile, destFile);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	  }
}
