package TEST;


import org.testng.annotations.Test;

import POM.Pom_ActitimeLoginPage;
import POM.Pom_actitimeHomePage;
import POM.TaskPage;

public class TC1_Actitime extends BaseTest
{
	@Test
	public void login() throws InterruptedException
	{
		Pom_ActitimeLoginPage log= new Pom_ActitimeLoginPage(driver);
		log.enterUsername();
		log.password();
		log.checkBox();
		log.login();
		
		Pom_actitimeHomePage home= new Pom_actitimeHomePage(driver);
		home.clickTask();
		
		TaskPage task= new TaskPage(driver);
		task.AddNewLink();
		task.NewCustomerLink();
		task.EnterCustomerName();
		task.EnterDescription();
		task.CreateCustomerButtom();
		
		
		
		
		
				
	}
}






//Pom_actitimeCreateCustomer customer= new Pom_actitimeCreateCustomer(driver);
//customer.EnterName();
//customer.EnterButton();