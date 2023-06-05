package POM;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pom_actitimeCreateCustomer 
{
	public WebDriver driver;
	public JavascriptExecutor js ;
	@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement EnterName;

	@FindBy (xpath = "//div[.='Create Customer']")
	private WebElement CustomerButton;


	public Pom_actitimeCreateCustomer(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this); 
	}
	public void EnterName()
	{
		js=(JavascriptExecutor)driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(EnterName));
		js.executeScript("arguments[0].value='GoluMolu'",EnterName );
	}
	public void EnterButton()
	{
		js=(JavascriptExecutor)driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(CustomerButton));
		js.executeScript("arguments[0].click()",CustomerButton );
	}



}
