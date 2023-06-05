package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MadBiker
{
	static
		{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
			
		}
		public static void test(ChromeDriver driver)
		{
			System.out.println("https://www.google.com");
			
		}
		public static void test(EdgeDriver driver)

		{
			System.out.println("https://www.google.com");
		
		}
	public static void main(String[]args)
		{
			ChromeDriver driver1=new ChromeDriver();
			MadBiker.test(driver1);
			EdgeDriver driver2=new EdgeDriver();
			MadBiker.test(driver2);
			
		}
	

	}

}
