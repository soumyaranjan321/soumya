package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class pratice {

	public static void main(String[] args)
	{
		//		1st
		//WebElement element=driver.findElement(By.xpath("//input[@id='email']"));
		//		Thread.sleep(1000);
		//		element.sendKeys("ipsita");
		//		System.out.println(element.getAttribute("value"));
		//		Thread.sleep(1000);
		//		element.clear();
		//		Thread.sleep(1000);
		//		System.out.println(element.getAttribute("value"));

		//	2nd
		//		WebElement element=driver.findElement(By.xpath("//input[@id='email']"));
		//		element.sendKeys("sony");
		//		element.clear();
		//		element.sendKeys("jasuuu");
		//		System.out.println(element.getAttribute("value"));
		//3rd
		//		username.sendKeys("motoo");
		//		Thread.sleep(1000);
		//		username.sendKeys(Keys.CONTROL,"a");
		//		Thread.sleep(1000);
		//		username.sendKeys(Keys.BACK_SPACE);
		//4th
		//		username.sendKeys("cartoon");
		//		username.sendKeys(Keys.CONTROL,"a");
		//		username.sendKeys(Keys.CONTROL,"c");
		//		WebElement password=driver.findElement(By.id("pass"));
		//		password.sendKeys(Keys.CONTROL,"v");
		//5th
		//		username.sendKeys("cartoon");
		//		username.sendKeys(Keys.CONTROL,"a");
		//		username.sendKeys(Keys.CONTROL,"x");
		//		WebElement password=driver.findElement(By.id("pass"));
		//		password.sendKeys(Keys.CONTROL,"v");
		//6th
		//		username.sendKeys("cartoon");
		//		Thread.sleep(1000);
		//		WebElement password=driver.findElement(By.id("pass"));
		//		Thread.sleep(1000);
		//		password.sendKeys("cartoon");
		//		Thread.sleep(1000);
		//		password.sendKeys(Keys.ENTER);
		//	7th
//		String car= username.getAttribute("value");
//		for(int i=0 ; i<car.length() ; i++)
//			{
//				Thread.sleep(2000);
//				username.sendKeys(Keys.BACK_SPACE);
	//	8th

//		WebElement username=driver.findElement(By.xpath("//input[@id='email']"));
//		System.out.println(username.getAttribute("placeholder"));
		//9th
//		username.sendKeys("motoo");
//		username.getAttribute("value");
//		String value=username.getAttribute("value");
//	    System.out.println(value.length());
		//10th
//		WebElement username=driver.findElement(By.xpath("//input[@id='email']"));
//		username.sendKeys("cartoon");
//		String usernamevalue=username.getAttribute("value");
//		WebElement password=driver.findElement(By.id("pass"));
//		password.sendKeys(usernamevalue);
//		if (password.getAttribute("value").equals("cartoon"))
//		{
//			System.out.println("copy done");
//
//		}
//		else
//		{
//			System.out.println("copy not done");
//		}
		//10th also but some difference i refference varriable
//		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://en-gb.facebook.com");
//		WebElement username=driver.findElement(By.xpath("//input[@id='email']"));
//		username.sendKeys("cartoon");
//		String usernamevalue=username.getAttribute("value");
//		WebElement password=driver.findElement(By.id("pass"));
//		password.sendKeys(usernamevalue);
//		String passwordvalue= password.getAttribute("value");
//		if (passwordvalue.equals(usernamevalue))
//		{
//			System.out.println("sucess");
//		}
//		else
//		{
//			System.out.println("fail");
//		}
		//11th
//	
           //11th
//		username.sendKeys("qspiders");
//		String value= username.getAttribute("value");
//		Thread.sleep(1000);
//		System.out.println(value.toUpperCase());
//		Thread.sleep(1000);
//		String element=value.toUpperCase();
//		Thread.sleep(1000);
//		username.sendKeys(Keys.CONTROL,"a");
//		username.sendKeys(Keys.BACK_SPACE);
//		username.sendKeys(element);
//		
		//12th
//		username.sendKeys("QSPIDERS");
//	    String value= username.getAttribute("value");
//		Thread.sleep(1000);
//		System.out.println(value.toLowerCase());
//		Thread.sleep(1000);
//		String element=value.toLowerCase();
//		Thread.sleep(1000);
//		username.sendKeys(Keys.CONTROL,"a");
//		username.sendKeys(Keys.BACK_SPACE);
//		username.sendKeys(element);
		//13th
//		username.sendKeys("qspiders");
//		String value= username.getAttribute("value");
//		for(int i=0 ; i<value.length() ; i++)
//		{
//			username.sendKeys(Keys.ARROW_LEFT);
//		}
//		username.sendKeys("jspiders");
		//13
//		username.sendKeys("qspiders");
//		String value= username.getAttribute("value");
//		Thread.sleep(1000);
//		System.out.println(value.toUpperCase());
//		
//		username.sendKeys(value.toUpperCase());
//
		// assigment 1 today1st
//		driver.get("https://myntra.com");
//		List<WebElement> alllink= driver.findElements(By.xpath("//a"));
//		System.out.println(alllink.size());
//		
//		for(int i=0 ; i<alllink.size(); i++)
//		{
//			System.out.println(alllink.get(i).getText());
//		
//		}
//		for(int i=0 ; i<alllink.size() ; i++)
//		{
//			System.out.println(alllink.get(i).getAttribute("href"));
//		}
//		//	List<WebElement> alllink= driver.findElements(By.xpath("//a"));
		
		//assignment 2 today 1st qns
//		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.yahoo.com");
//		WebElement searchbar=driver.findElement(By.id("ybar-sbq"));
//		searchbar.sendKeys("selenium");
//		Thread.sleep(1000);
//	List<WebElement> allsuggestions=driver.findElements(By.xpath("//span[@style='display: block;']"));
//	System.out.println(allsuggestions.size());
//	allsuggestions.get(5).click();
		// 2nd qns 
//		driver.get("https://www.myntra.com");
//		Thread.sleep(1000);
//		WebElement scarchbar=driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
//		scarchbar.sendKeys("Tummy Hilfiger ");
//		Thread.sleep(1000);
//		List<WebElement> allsuggestions=driver.findElements(By.xpath("//li[contains(text(),'Tommy Hilfiger')]"));
//		System.out.println(allsuggestions.size());
//		Thread.sleep(3000);
//		allsuggestions.get(2).click();
		//3rd
//		driver.get("https://www.amazon.com");
//		Thread.sleep(1000);
//		WebElement scarchbar=driver.findElement(By.xpath("//input[@placeholder='Search Amazon']"));
//		scarchbar.sendKeys("iphone 14");
//		Thread.sleep(1000);
//		List<WebElement>allsuggestions=driver.findElements(By.xpath("//span[contains(text(),'iphone 14')]"));
//		System.out.println(allsuggestions.size());
//		Thread.sleep(2000);
//		for(int i=0 ;i<5 ;i++)
//		{
//			Thread.sleep(1000);
//			allsuggestions.sendKeys(Keys.ARROW_DOWN);
//		}
//		allsuggestions.sendKeys(Keys.ENTER);
		
		
//		driver.get("https://www.amazon.com");
//		Thread.sleep(1000);
//		WebElement scarchbar=driver.findElement(By.xpath("//input[@placeholder='Search Amazon']"));
//		scarchbar.sendKeys("iphone 14");
//		Thread.sleep(1000);
//		List<WebElement>allsuggestions=driver.findElements(By.xpath("//div[contains(text(),'iphone 14')]"));
//		System.out.println(allsuggestions.size());
//		Thread.sleep(2000);
//		for(int i=0 ;i<5 ;i++)
//		{
//			Thread.sleep(1000);
//			scarchbar.sendKeys(Keys.ARROW_DOWN);
//		}
//		scarchbar.sendKeys(Keys.ENTER);
//4th qns
//		driver.get("https://www.wikipedia.com");
//		WebElement scarchbar= driver.findElement(By.xpath("//input[@autofocus='autofocus']"));
//		scarchbar.sendKeys("india");
//		Thread.sleep(1000);
//		List<WebElement> allsuggestions= driver.findElements(By.xpath("//div[@class='suggestion-text']"));
//		System.out.println(allsuggestions.size());
//		Thread.sleep(3000);
//		allsuggestions.get(2).click();
//		driver.get("https://www.amazon.com");
//	      Thread.sleep(1000);
//			WebElement scarchbar=driver.findElement(By.xpath("//input[@placeholder='Search Amazon']"));
//			scarchbar.sendKeys("iphone 14");
//			Thread.sleep(5000);
//			List<WebElement>allsuggestions=driver.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
//			System.out.println(allsuggestions.size());
//			Thread.sleep(2000);
//			for(int i=0 ;i<4 ;i++)
//				
//			{
//				Thread.sleep(1000);
//				scarchbar.sendKeys(Keys.ARROW_DOWN);
//			}
//			scarchbar.sendKeys(Keys.ENTER);
//			
//		driver.get("https://www.myntra.com");
//		WebElement menlink=driver.findElement(By.xpath("//a[.='Men']"));
//		menlink.click();
//
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//h4[contains(text(),'Biggest Deals On Top Brands')]/../../..//img[contains(@src,'Puma')]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[.='Categories']/..//div[@class='categories-more']")).click();
//
//		List<WebElement> allcheckbox = driver.findElements(By.xpath("//ul[@class='FilterDirectory-list']//div[@class='common-checkboxIndicator']"));
//        System.out.println(); allcheckbox.size();
//		for(int i = 0 ; i < allcheckbox.size() ;  i+=2)
//		{
//			Thread.sleep(3000);
//			allcheckbox.get(i).click();
////		
//		
//driver.get("https://en-gb.facebook.com");
//		driver.findElement(By.xpath("//a[.='Create new account']")).click();
//		Thread.sleep(2000);
//		WebElement date=driver.findElement(By.xpath("//select[@name='birthday_day']"));
//		Select select= new Select(date);
//		select.selectByVisibleText("20");
//		Thread.sleep(2000);
//		WebElement month=driver.findElement(By.xpath("//select[@name='birthday_month']"));
//		Select select1=new Select(month);
//		select1.selectByVisibleText("Feb");
//		WebElement year=date.findElement(By.xpath("//select[@name='birthday_year']"));
//		Select select2=new Select(year);
//		select2.selectByVisibleText("2000");
//		  
		
		// Assigment 4 dropdown
		
//		WebElement listbox= driver.findElement(By.xpath("//select[@name='students']"));
//		Select select= new Select(listbox);
//		List<WebElement> Alloptions= select.getOptions();
//		List<String> list= new ArrayList<>();
//		for(int i=0; i<Alloptions.size(); i++)
//		{
//			String textOfOptions=Alloptions.get(i).getText();
//			list.add(textOfOptions);
//			
//		}
//		Collections.sort(list);
//		System.out.println("ascending order sorting is:"+list);
//		}
	//WebElement listbox= driver.findElement(By.xpath("//select[@name='students']"));
	//Select select= new Select(listbox);
	//List<WebElement> alloptions=select.getOptions();
	//List<String> list= new ArrayList<>();
	//for(int i=0;i<alloptions.size();i++)
	//{
//		String textOfoptions=alloptions.get(i).getText();
//		list.add(textOfoptions);
	//}
	//Collections.sort(list,Collections.reverseOrder());
	//System.out.println("desending order sorting is"+list);


	//WebElement listbox= driver.findElement(By.xpath("//select[@name='students']"));		
	//Select select= new Select(listbox);
	//List<WebElement> alloptions=select.getOptions();
	//Set<String> set= new HashSet<>();
	//for(int i=0; i<alloptions.size(); i++)
	//{
//		String textOfoptions=alloptions.get(i).getText();
//		set.add(textOfoptions);
	//}
	//System.out.println("unique contex of the dropdownlist is:"+set);



	//WebElement listbox= driver.findElement(By.xpath("//select[@name='students']"));
	//Select select= new Select(listbox);
	//List<WebElement> Alloptions= select.getOptions();
	//int count=0;
	//for(int i=0;i<Alloptions.size();i++)
	//{
//		if (Alloptions.get(i).getText().equals("Cartoon")) 
//		{
//			count++;
//		}
	//}
	//System.out.println("occurence of Cartoon is:"+count);
	//
	//
	//

//		
//		

	
	
		
		
		
		
		
		
////		
		
//		
	}
	

//	
//			

	}