package testNGProgram;

import org.testng.annotations.Test;

import PagebjectModel.Pom_ActitimeLoginPage;

public class Tc1_loginLOgout extends Basetest
{
 @Test
 
 public void loginlogout()
 {
	 Pom_ActitimeLoginPage loginpage=new Pom_ActitimeLoginPage(driver);
 }
}
