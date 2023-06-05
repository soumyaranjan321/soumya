package Tastcase;


import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic.BaseTest;
import Page.ActitimeLoginPage;
import Page.Pom_actitimeHomePage;

//@Listeners(Generic.TestFailure.class)

@Listeners(Generic.MultipleScreenshot.class)
public class TC1_ActitimeLoginLogout extends BaseTest
{ 
	@Test
	public void loginlogout() throws IOException
	{
		ActitimeLoginPage loginPage=new ActitimeLoginPage(driver);
		//loginPage.moveToelement();
		loginPage.loginMethod();
		loginPage.titlevalidate();
	}

	@Test(priority = 1)
	public void logout()
	{

		Pom_actitimeHomePage homePage=new Pom_actitimeHomePage(driver);
		homePage.logoutmethod();


	}
}
