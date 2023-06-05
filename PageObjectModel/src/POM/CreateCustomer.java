package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateCustomer
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

	@FindBy(id="container_tasks")
	private WebElement clicktask;

	@FindBy(xpath = "//div[@type='Add New']")
	private WebElement AddNew;



	public CreateCustomer(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	} 
	public void login()
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='admin'",usernameTextfield);
		WebDriverWait wait1= new WebDriverWait(driver, Duration.ofSeconds(20));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='manager'",passwordTextField);
		WebDriverWait wait2= new WebDriverWait(driver, Duration.ofSeconds(20));
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[.='Login ']")));
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",loginButton);
		System.out.println("Didi");
	}
	public void taskbutton()
	{
		WebDriverWait wait3= new WebDriverWait(driver, Duration.ofSeconds(20));
		wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='container_tasks']")));
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", clicktask);
		System.out.println("motoo");
	}
	public void AddNew()
	{
		WebDriverWait wait4= new WebDriverWait(driver, Duration.ofSeconds(20));
		wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[.='Add New']")));
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", clicktask);
		System.out.println("cartoon");
	}

}

//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//wait.until(ExpectedConditions.visibilityOf(usernameTextfield));
//js= (JavascriptExecutor) driver;
//js.executeScript("arguments[0].value='admin'", usernameTextfield);