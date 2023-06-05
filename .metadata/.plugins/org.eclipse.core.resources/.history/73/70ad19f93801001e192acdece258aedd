package Page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_actitimeHomePage 
{
	WebDriver driver;
	JavascriptExecutor js;
	@FindBy(xpath = "//a[.='Logout']")
	private WebElement logoutLink;
	private WebElement clicktask;

	public Pom_actitimeHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public void logoutmethod()
	{
	logoutLink.click();
	}
	public void clicktask()
	{
		clicktask.click();
	}
}