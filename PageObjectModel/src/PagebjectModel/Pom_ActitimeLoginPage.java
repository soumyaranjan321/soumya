package PagebjectModel;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pom_ActitimeLoginPage 
{
	public WebDriver driver;
	public JavascriptExecutor js ;
	@FindBy(id="username")
	private WebElement usernameTextfield;
	
	@FindBy(name="pwd")
	private WebElement passwordTextField;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement keepLoggedInCheckbox;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	@FindBy(xpath ="//a[.='Forgot your password?']")
	private WebElement forgotyourpasswordLink;

	@FindBy(xpath ="//a[.='actiTIME Inc.']")
	private WebElement actitimeInc;
	
	public Pom_ActitimeLoginPage(WebDriver driver)
	
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
   public void loginmethod() throws InterruptedException
   {
	   js = (JavascriptExecutor) driver;
	   usernameTextfield.sendKeys("admin");
	   passwordTextField.sendKeys("manager");
	   //keepLoggedInCheckbox.click();
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	   wait.until(ExpectedConditions.visibilityOf(keepLoggedInCheckbox));
	   js.executeScript("arguments[0].click()", keepLoggedInCheckbox);
	   loginButton.click();
	   Thread.sleep(2000);
	   String homepageTitle=driver.getTitle();
	   if (homepageTitle.contains("Time_track")) 
	   {
		System.out.println("navigate to homepage");
	}
   }
   public void forgotyourpasswordmethod()
   {
	   forgotyourpasswordLink.click();
   }
   public void actitimeMethod()
   {
	   actitimeInc.click();
   }
	 
	
	
	

}
