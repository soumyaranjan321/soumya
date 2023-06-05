package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("https://qspiders.com/contact");
//		driver.findElement(By.xpath("//p[contains(text(),'United States')]/../..//span[contains(text(),'+14154293957')]"));
//		System.out.println(driver.findElement(By.xpath("//p[contains(text(),'United States')]/../..//span[contains(text(),'+14154293957')]")).getText());
//		driver.get("https://opensource-demo.orangehrmlive.com");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button['Login']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//span[text()='Directory']")).click();
//		Thread.sleep(5000);
//		System.out.println( driver.findElement(By.xpath("//p[.='Peter Mac Anderson ']/../p[2]")).getText());
		driver.get("https://demo.actitime.com/");
		Thread.sleep(2000);
		
				driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//a['Login']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//a[text()='Types of Work']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//span[text()='Create Type of Work']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@name='name']")).sendKeys("cartoon1234567");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@name='name']/../../../../../../..//input[@value=\"   Create Type of Work   \"]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//a[contains(text(),'cartoon1234567')]/../..//a[contains(text(),'delete')]")).click();
				Thread.sleep(52000);
				driver.findElement(By.xpath("//a[contains(text(),'delete')]")).click();
				
				





















		//		new	//input[@name='name']/../../../../../../..//input[contains(text(),'Create Type of Work')]
		//input[@name='name']/../../../../../../..//input[@value="   Create Type of Work   "]

		//input[@name='name']/../../../../../../..//input

		//	new	//input[@name='name']/../../../../../../..//input[contains(text(),'Create Type of Work')]
		//input[@name='name']/../../../../../../..//input[@value="   Create Type of Work   "]

		//input[@name='name']/../../../../../../..//input






		//   driver.findElement(By.xpath("//p['Peter Mac Anderson ']/../p[2]")).getText();

		//driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-directory-card-subtitle']")).click();
		// driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--span oxd-main-menu-item--name']")).click();

		//System.out.println( driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-directory-card-subtitle']")).getText());
		//driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-directory-card-subtitle']")).click();

	}
}
//(//a['@Directory'])[10]
////p[@class="oxd-text oxd-text--p orangehrm-directory-card-subtitle"]





