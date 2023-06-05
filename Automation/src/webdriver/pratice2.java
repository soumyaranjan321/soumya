package webdriver;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class pratice2 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.americanairlines.in/intl/in/index.jsp?locale=en_IN");
		WebElement sand=driver.findElement(By.xpath("(//input[contains(@placeholder,'City or airport')])[1]"));
		sand.sendKeys("san");
		Thread.sleep(5000);
		List<WebElement> allsuggestions=driver.findElements(By.xpath("//li[contains(@role,'presentation')]"));
		Thread.sleep(5000);
		System.out.println(allsuggestions.size());	                      
		Thread.sleep(3000);
		//allsuggestions.get(4).click();
		for(int i=0; i<allsuggestions.size();i++)
		{
			if(allsuggestions.get(i).getText().equalsIgnoreCase("San Antonio (SAT), Texas, USA"));
		
		{
	      allsuggestions.get(i).click();
	      break;
        
		}
		}
		WebElement sand2=driver.findElement(By.name("destination"));
		sand2.sendKeys("las");
		Thread.sleep(2000);
         List<WebElement> allsuggestions1=driver.findElements(By.xpath("//a[contains(text(),'Las')]"));
		
		Thread.sleep(5000);
		System.out.println(allsuggestions1.size());
		Thread.sleep(3000);
		for(int i=0; i<allsuggestions1.size();i++)
		{
			if(allsuggestions1.get(i).getText().equalsIgnoreCase("Las Palmas (LPA), Gran Canaria, Spain"));
		
		{
	      allsuggestions1.get(i).click();
	      break;
        
		}
		}
		WebElement adult= driver.findElement(By.xpath("//select[@name='adults']"));
	Select select= new Select(adult);
	select.selectByVisibleText("4");
	Thread.sleep(2000);
	WebElement children=driver.findElement(By.xpath("//select[@name='children']"));
	Select select1=new Select(children);
	select1.selectByIndex(3);
	
	}
}









	














		//		Select select= new Select(listbox);
		//		select.selectByVisibleText("ABC");
		//		select.selectByValue("def");
		//		select.selectByIndex(2);
		//		Thread.sleep(2000);
		//select.deselectAll();
		//select.deselectByValue("abc");
		//select.deselectByIndex(2);

	
