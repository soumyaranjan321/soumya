package TEST;

import org.testng.annotations.Test;

import POM.Pom_ActitimeLoginPage;
import POM.Pom_actitimeCreateCustomer;
import POM.Pom_actitimeHomePage;
import POM.TaskPage;

public class Test2 extends BaseTest
{
	@Test
	public void TaskCLick()
	{		
		Pom_ActitimeLoginPage log= new Pom_ActitimeLoginPage(driver);
		log.enterUsername();
		log.password();
		log.checkBox();
		log.login();
		Pom_actitimeHomePage home= new Pom_actitimeHomePage(driver);
		home.clickTask();
	}
	@Test(priority = 1 ,invocationCount = 1)
	public void EnterCustomerName()
	{
		TaskPage page= new TaskPage(driver);
		page.AddNewLink();
		page.NewCustomerLink();
		page.EnterCustomerName();
		page.EnterDescription();
		page.CreateCustomerButtom();
	}
	@Test(priority = 2,invocationCount = 1)
	public void EnterCustomer()
	{
		Pom_actitimeCreateCustomer customer=new Pom_actitimeCreateCustomer(driver);
		customer.EnterName();
		customer.EnterButton();
	}
}

