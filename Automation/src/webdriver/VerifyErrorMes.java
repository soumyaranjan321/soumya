package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyErrorMes {

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.logfile", "./log file/chromelog.txt");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.actitime.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Thread.sleep(2000);
		WebElement errormsg=driver.findElement(By.xpath("(//span[@class='errormsg'])[1]"));
		System.out.println(errormsg.getText());
		
		if(errormsg.getText().equals("Username or Password is invalid. Please try again."))
		{
			System.out.println("Error Msg matching");
		}
		else
		{
			System.out.println("Error Msg Not Matching");
		}
	}

}
