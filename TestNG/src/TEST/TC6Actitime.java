package TEST;

import org.testng.annotations.Test;

import POM.LeaveType;
import POM.Pom_ActitimeLoginPage;
import POM.Pom_actitimeHomePage;

public class TC6Actitime extends BaseTest
{
@Test
public void CreateNewLeaveType()
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
	home.CreateLeaveType();
	
	LeaveType leave= new LeaveType(driver);
	leave.entername();
	leave.checkbox();
	leave.submit();
}

}
