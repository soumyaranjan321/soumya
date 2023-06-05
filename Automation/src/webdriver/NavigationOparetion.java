package webdriver;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationOparetion {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.myntra.com");
		Set<Cookie> cookies = driver.manage().getCookies();

		Cookie cookie=driver.manage().getCookieNamed("bm_sv");
		
			System.out.println("Name of Cookies" + " : " + cookie.getName());
			System.out.println(""+ "--------------------------");
		}

		
	}

