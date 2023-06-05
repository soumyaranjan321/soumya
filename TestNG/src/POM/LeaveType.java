package POM;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LeaveType 
{
	public WebDriver driver;
	public JavascriptExecutor js;	

	@FindBy(xpath = "//input[@placeholder='Leave Type Name']")
	private WebElement entername;

	@FindBy(xpath = "(//input[@type='checkbox'])[3]")
	private WebElement checkbox;

	@FindBy(xpath = "(//span[.='Create Leave Type'])[2]")
	private WebElement submit;

	public LeaveType(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	public void entername()
	{
		js=(JavascriptExecutor)driver;
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(entername));
		js.executeScript("arguments[0].value='Didi'",entername );
	}
	public void checkbox()
	{
		js=(JavascriptExecutor) driver;
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(checkbox));
		js.executeScript("arguments[0].click()", checkbox);
	}
	public void submit()
	{
		js=(JavascriptExecutor) driver;
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(submit));
		js.executeScript("arguments[0].click()", submit);
	}



}









