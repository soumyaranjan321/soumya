package POM;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateTypeOfWork 
{
 public WebDriver driver;
 public JavascriptExecutor js;
 
 @FindBy(xpath = "//input[@style='width: 450px']")
 private WebElement InputName;
 
 @FindBy(xpath = "//input[@type='submit']")
 private WebElement submitlink;
 
 public CreateTypeOfWork(WebDriver driver)
 {
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
 }
 public void TypeofWork()
 {
	 js=(JavascriptExecutor)driver;
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(InputName));
	js.executeScript("arguments[0].value='GoluMolu'", InputName);
 }
 public void submit()
 {
	 js=(JavascriptExecutor)driver;
	 WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.visibilityOf(submitlink));
	 js.executeScript("arguments[0].click()", submitlink);
	 
 }
}
