package com.actitime.testcases;

import java.io.IOException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.actitime.generics.BaseTest;
import com.actitime.pages.ActitimeLoginPage;
import com.actitime.pages.Pom_actitimeHomePage;

@Listeners(com.actitime.generics.MultipleScreenshot.class)
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
