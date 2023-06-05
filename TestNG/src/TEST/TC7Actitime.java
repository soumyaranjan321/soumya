package TEST;

import org.testng.annotations.Test;

import POM.DeleteLeaveType;
import POM.Pom_ActitimeLoginPage;
import POM.Pom_actitimeHomePage;

public class TC7Actitime extends BaseTest
{
	@Test
	public void deleteleavetype()
	{
		Pom_ActitimeLoginPage log= new Pom_ActitimeLoginPage(driver);
		log.enterUsername();
		log.password();
		log.checkBox();
		log.login();

		Pom_actitimeHomePage home= new Pom_actitimeHomePage(driver);
		home.clickTask();
		home.Setting();
		home.LeaveTypes();
		DeleteLeaveType type= new DeleteLeaveType(driver);
		type.deleteleavetype();
		driver.switchTo().alert().accept();

	}
}
