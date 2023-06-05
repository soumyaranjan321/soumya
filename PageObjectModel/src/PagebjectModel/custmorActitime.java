package PagebjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class custmorActitime 
{

	public WebDriver driver;

	@FindBy(id="username")
	private WebElement username;

	@FindBy(name="pwd")
	private WebElement password;

	@FindBy(id="keepLoggedInCheckbox")
	private WebElement checkbox;

	@FindBy(id="loginButton")
	private WebElement loginButton;

	@FindBy(xpath ="//a[.='Forgot your password?']")
	private WebElement forgotyourpassword;

	@FindBy(xpath ="//a[.='actiTIME Inc.']")
	private WebElement actitimeIncc;

	public custmorActitime(WebDriver driver)

	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void loginMethod()
	{
		username.sendKeys("admin");
		password.sendKeys("manager");
		checkbox.click();
		loginButton.click();
		String homepageTitle=driver.getTitle();
		if (homepageTitle.contains("Time_track")) 
		{
			System.out.println("navigate to homepage");
		}

	}
	public void forgotPass()
	{
		forgotyourpassword.click();

	}
	public void actitimemethood()
	{
		actitimeIncc.click();
	}

}

