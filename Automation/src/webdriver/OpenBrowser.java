package webdriver;

import java.util.Set;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser

{
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		Set<Cookie> cookies = driver.manage().getCookies();
         for(Cookie cookie :cookies)
         {
        	 
         }
		}
		
		
		
	}



