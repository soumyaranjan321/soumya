package POM;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DeleteTypeOfWork 
{
 public WebDriver driver;
 public JavascriptExecutor js;
 
 @FindBy(xpath = "//a[.='GoluMolu']/../..//a[contains(text(),'delete')]")
 private WebElement delete;
 
 public DeleteTypeOfWork(WebDriver driver)
 {
	 this.driver= driver;
	 PageFactory.initElements(driver, this);
	}
 public void DeleteTypeofWork()
 {
	 js=(JavascriptExecutor)driver;
	 WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.visibilityOf(delete));
	 js.executeScript("arguments[0].click()", delete);
	 driver.switchTo().alert().accept();
	 
 }
}
