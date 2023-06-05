package testNGProgram;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultipleDependency 
{
	@Test
	public void Login()
	{
		Assert.fail();
		System.out.println("login");
	}
	@Test(dependsOnMethods = "Login")
	public void createWork() 
	{
		System.out.println("work create");
	}
	@Test(dependsOnMethods = {"Login","createWork"})
	public void deleteWork()
	{
		System.out.println("workDelete");
	}
	

}