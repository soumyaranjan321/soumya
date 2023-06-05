package webdriver;



import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCookies
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
 Set<Cookie> OldCookies=driver.manage().getCookies();
 List<String> a1= new ArrayList<>();
 for(Cookie cookie:OldCookies)
 {
	 String cookieName=cookie.getName();
	 a1.add(cookieName);
 }
 if(a1.contains("NID"))
	{
	 System.out.println("Cookies is present ");
	}
 else
 {
	 System.out.println("Cookies is not present");
 }
 driver.manage().deleteCookieNamed("OGPC");
Set<Cookie> OldCookies1=driver.manage().getCookies();
List<String> all=new ArrayList<>();
for(Cookie cookie:OldCookies1)
{
	String cookieName1=cookie.getName();
	all.add(cookieName1);
}
if(all.contains("OGPC"))
{
	System.out.println("Cookie is not deleted");
}
else
{
	System.out.println("Cookie is deleted");
}
 	
	}
}
