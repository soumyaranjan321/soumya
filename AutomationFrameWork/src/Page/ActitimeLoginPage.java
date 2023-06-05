package Page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.AutoConstant;
import Generic.BasePage;
import Generic.ExcelLibrary;
import Generic.Screenshot1;

public class ActitimeLoginPage extends BasePage implements AutoConstant
{
	public WebDriver driver;

	@FindBy(id = "username")
	private WebElement usernameTextfield;

	@FindBy(name = "pwd")
	private WebElement passwordTextfield;

	@FindBy(id = "keepLoggedInCheckBox")
	private WebElement keepmeloggedinCheckbox;

	@FindBy(id = "loginButton")
	private WebElement loginButton;

	@FindBy(xpath = "//a[.='Forgot your password?']")
	private WebElement forgotyourpasswordLink;

	@FindBy(xpath = "//a[.='actiTIME Inc.']")
	private WebElement actitimeincLink;

	public ActitimeLoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void loginMethod() throws IOException
	{
		visibilityofElement(driver, usernameTextfield);
		usernameTextfield.sendKeys(ExcelLibrary.getcellvalue(sheet_name_login, 1, 0));
		Screenshot1.takeElementScreenshot(usernameTextfield, "username");

		visibilityofElement(driver, passwordTextfield);
		passwordTextfield.sendKeys(ExcelLibrary.getcellvalue(sheet_name_login, 1, 1));
		Screenshot1.takeElementScreenshot(passwordTextfield, "password");

		visibilityofElement(driver, keepmeloggedinCheckbox);
		javascriptClick(driver, keepmeloggedinCheckbox);
		Screenshot1.takeElementScreenshot(keepmeloggedinCheckbox, "keepmeloggedin");

		visibilityofElement(driver, loginButton);
		javascriptClick(driver, loginButton);
		Screenshot1.takeElementScreenshot(loginButton, "loginbutton");
	}

	public void titlevalidate()
	{
		titleis(driver, "actiTIME - Enter Time-Track");
		validateTitle(driver, "actiTIME - Enter Time-Track");

	}
	public void moveToelement()
	{
		movetoElement(driver,usernameTextfield);
	}
	public void visibilityofElementLocator()
	{
		visibilityofElementLocator(driver,passwordTextfield,By.xpath("//input[@name='username']"));
	}
}
