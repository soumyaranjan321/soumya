package PagebjectModel;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class googlePomClass
{
	public WebDriver driver;
	JavascriptExecutor js;
	@FindBy(xpath="//textarea[@aria-label='Search']")
	private WebElement Searchbar;
	@FindBy(xpath="//span[contains(text(),'google')]")
	private List<WebElement> autoSuggestions;

	public googlePomClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void googleSearchbar()
	{
		Searchbar.sendKeys("google");
	}
	
	public void googlAutosuggestion()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfAllElements(autoSuggestions));
		System.out.println(autoSuggestions.size());
		
		for(int i=0;i<autoSuggestions.size();i++)
		{
			if (autoSuggestions.get(i).getText().equalsIgnoreCase("google translate")) 
			{
				js.executeScript("arguments[0].click()", autoSuggestions.get(i));
			}
		}
		System.out.println(driver.getTitle());
		if(driver.getTitle().contains("google translate"))
		{
			System.out.println("title validated");
		}
		else 
		{
			System.out.println("title is not validated");
		}
	}
}
