package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {

	public static void main(String[] args) 
	{
		
	 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	 ChromeDriver driver=new ChromeDriver();
	 driver.get("https://www.youtube.com/");
		
	}
}