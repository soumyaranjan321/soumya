package TEST;

import org.testng.annotations.Test;

import POM.CreateTypeOfWork;
import POM.Pom_ActitimeLoginPage;
import POM.Pom_actitimeHomePage;

public class TC4Actitime extends BaseTest
{
	@Test
	public void CreateTypeOfWOrk()
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
		home.CreateTypeofWork();

		CreateTypeOfWork work= new CreateTypeOfWork(driver);
		work.TypeofWork();
		work.submit();
		
		
		
	}
}