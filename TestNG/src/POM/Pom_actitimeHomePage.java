package POM;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pom_actitimeHomePage 
{
	WebDriver driver;
	JavascriptExecutor js;

	@FindBy(xpath = "//a[.='Logout']")
	private WebElement logoutLink;

	@FindBy(xpath = "//div[@id='container_tasks']")
	private WebElement ClickTask;

	@FindBy(xpath = "(//div[@class='menu_icon'])[2]")
	private WebElement Setting;

	@FindBy(xpath = "//a[.='Types of Work']")
	private WebElement TypesofWork;
	
	@FindBy(xpath = "//span[.='Create Type of Work']")
	private WebElement CreateTypeofWork;
	
	@FindBy(xpath = "//a[.='Leave Types']")
	  private WebElement LeaveTypes;
	
	@FindBy (xpath = "//span[.='Create Leave Type']")
	private WebElement CreateLeaveType;


	public Pom_actitimeHomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public void logoutmethod()
	{
		js=(JavascriptExecutor)driver;
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(logoutLink));
		js.executeScript("arguments[0].click()", logoutLink);
		//	logoutLink.click();
	}
	public void clickTask()
	{
		js= (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(ClickTask));
		js.executeScript("arguments[0].click()", ClickTask);
		//ClickTask.click();
	}
	public void Setting()
	{
		js=(JavascriptExecutor)driver;
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(Setting));
		js.executeScript("arguments[0].click()",Setting);
	}
	public void TypesofWork()
	{
		js=(JavascriptExecutor)driver;
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(TypesofWork));
		js.executeScript("arguments[0].click()", TypesofWork);
	}
	public void CreateTypeofWork()
	{
		js=(JavascriptExecutor)driver;
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(CreateTypeofWork));
		js.executeScript("arguments[0].click()", CreateTypeofWork);
	}
	public void LeaveTypes()
	{
		js=(JavascriptExecutor)driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(LeaveTypes));
		js.executeScript("arguments[0].click()", LeaveTypes);
	}
	public void CreateLeaveType()
	{
		js=(JavascriptExecutor)driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(CreateLeaveType));
		js.executeScript("arguments[0].click()", CreateLeaveType);
	}
	
	
}