import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sanga1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.americanairlines.in/intl/in/index.jsp");
        
        WebElement text=driver.findElement(By.id("aa-leavingOn"));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].value='20/02/2000'",text );
        		


	}
}




















//driver.get("https://www.americanairlines.in/intl/in/index.jsp");
//
//WebElement text=driver.findElement(By.id("aa-leavingOn"));
//JavascriptExecutor js=(JavascriptExecutor)driver;
//js.executeScript("arguments[0].value='20/02/2000'",text );
		


}
}
