package POM;

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
	
	
	public Pom_ActitimeLoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void enterUsername()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(usernameTextfield));
		js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='admin'", usernameTextfield);
	}
	
	public void password()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(passwordTextField));
		js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='manager'", passwordTextField);
	}
	
	public void checkBox()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(keepLoggedInCheckbox));
		js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", keepLoggedInCheckbox);
	}
	public void login()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(loginButton));
		js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", loginButton);
	}
}
