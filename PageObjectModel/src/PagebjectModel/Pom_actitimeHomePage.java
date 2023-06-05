package PagebjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_actitimeHomePage 
{
  @FindBy(xpath = "//a[.='Logout']")
  private WebElement logoutLink;
  
	public Pom_actitimeHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void logoutmethod()
	{
		logoutLink.click();
	}
}
