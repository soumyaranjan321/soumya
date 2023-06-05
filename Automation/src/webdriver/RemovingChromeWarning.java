package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemovingChromeWarning {

	public static void main(String[] args)
	{
		//System.setProperty("webdriver.chrome.silentOutput","true");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("motoo");
	}

}
