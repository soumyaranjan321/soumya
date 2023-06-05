package TEST;

import org.testng.annotations.Test;

import POM.DeleteTypeOfWork;
import POM.Pom_ActitimeLoginPage;
import POM.Pom_actitimeHomePage;

public class TC5Actitime extends BaseTest
{
	@Test
	public void logintodeletetypeofwork()
	{
		Pom_ActitimeLoginPage log= new Pom_ActitimeLoginPage(driver);
		log.enterUsername();
		log.password();
		log.checkBox();
		log.login();

		Pom_actitimeHomePage home= new Pom_actitimeHomePage(driver);
		home.clickTask();
		home.Setting();
		home.TypesofWork();
 
		DeleteTypeOfWork work= new DeleteTypeOfWork(driver);
		work.DeleteTypeofWork();
		
	}
 
}
