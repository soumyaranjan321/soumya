package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//driver.get("https://www.myntra.com");
		//System.out.println(driver.findElement(By.linkText("Men")).getText());
		driver.get("https://en-gb.facebook.com");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("firstname")).sendKeys("fnd");
		Thread.sleep(1000);
		driver.findElement(By.name("lastname")).sendKeys("soumya");
		Thread.sleep(1000);
		driver.findElement(By.name("reg_email__")).sendKeys("motoo@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("reg_passwd__")).sendKeys("cartoon");
		//driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("somu");		
		// driver.findElement(By.xpath("//button[.='Log in']")).click();
		//  driver.findElement(By.xpath("//input[contains(@placeholder,'Email address')]")).sendKeys("suryaa");
		//driver.findElement(By.xpath("//input[contains(@placeholder,'Email address')]")).sendKeys("cartton");
		//	driver.findElement(By.xpath("//a[contains(text(),'password')]")).click();
		//driver.findElement(By.xpath("//a[contains(.,'password')]")).click();
		//driver.findElement(By.xpath("//input[contains(@placeholder,'First')]")).sendKeys("motoo");
		// driver.findElement(By.xpath("//a[contains(.,'Sign')]")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Sign')]")).click();
		//driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		//		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		//		WebDriver driver = new ChromeDriver();
		//		driver.get("https://demo.actitime.com");
		//		Thread.sleep(3000);
		//		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		//		Thread.sleep(3000);
		//		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager");
		//		Thread.sleep(3000);
		//		driver.findElement(By.xpath("//a['Login']")).click();
		//		Thread.sleep(3000); 
		//		driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click()
		//	driver.get("https://en-gb.facebook.com");
		//	Thread.sleep(1000);
		//	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		//	Thread.sleep(1000);
		//    driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("soumya");
		//    Thread.sleep(1000);
		//    driver.findElement(By.xpath("//input[@aria-label='Surname']")).sendKeys("motoo");
		//    Thread.sleep(1000);
		//    driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("cartoon");
		//    Thread.sleep(1000);
		//    driver.findElement(By.xpath("//input[@aria-label='New password']")).sendKeys("jaaan");	
		//	   	driver.get("http://login.yahoo.com/account/create");
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//input[@autocomplete='given-name']")).sendKeys("motoo");
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//input[@autocomplete='family-name']")).sendKeys("cartoon");
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//input[@data-ylk='elm:input;elmt:email;slk:email;mKey:email']")).sendKeys("chicha");
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("anil");
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//input[@placeholder='YYYY']")).sendKeys("2000");
		//	Thread.sleep(1000);
		//	driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("motoo");
		//	Thread.sleep(1000);
		//	driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("cartoon");
		//	Thread.sleep(1000);
		//	driver.findElement(By.xpath("//button[@type='submit']")).click();
		//			Thread.sleep(1000);
		//			driver.findElement(By.xpath("//span[@class='_aacl _aaco _aacw _aad0 _aad7']")).click();
		//			Thread.sleep(1000);
		//			driver.findElement(By.xpath("//input[@aria-label='Mobile Number or Email']")).sendKeys("motoo");
		//			Thread.sleep(1000);
		//			driver.findElement(By.xpath("//input[@aria-label='Full Name']")).sendKeys("cartoon");
		//			Thread.sleep(1000);
		//			driver.findElement(By.xpath("//input[@aria-label='Username']")).sendKeys("crush");
		//			Thread.sleep(1000);
		//			driver.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("darling");
		//		driver.get("http://crmacces.vtiger.com/log-in/?mode=continue");
		//		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("motoo@gmail.com");
		//		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("cartoon");
		//		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//	driver.get("https://www.netflix.com/in/login");
		//	Thread.sleep(1000);
		//	driver.findElement(By.xpath("//input[@autocomplete='email']")).sendKeys("motoo");
		//	Thread.sleep(1000);
		//	driver.findElement(By.xpath("//input[@autocomplete='password']")).sendKeys("carton");
		//	Thread.sleep(1000);
		//	driver.findElement(By.xpath("//button[@data-uia='login-submit-button']")).click();
//		Thread.sleep(2000);
//		String actualtitile= driver.getTitle();
//		Thread.sleep(2000);
//		System.out.println(driver.getTitle());
//		Thread.sleep(2000);
//		driver.findElement(By.id("username")).sendKeys("admin");
//		Thread.sleep(2000);
//		driver.findElement(By.name("pwd")).sendKeys("manager");
//		Thread.sleep(2000);
//		driver.findElement(By.linkText("Login")).click();
//		System.out.println(driver.getTitle());
//		Thread.sleep(2000);
//		String hometitle= driver.getTitle();
//		System.out.println(driver.getTitle());
//		Thread.sleep(2000);
//		if (actualtitile.equals(hometitle))	
//		{
//		System.out.println("title is matched");
//			
//		}
//		else
//		{
//			System.out.println("title is not matched");
//		}
		
	//	imp      //a[text()='Types of Work']
		////input[@title='Please enter a Name for this Type of Work.']
		
	
	
	}

}
