package testNGProgram;

import org.testng.annotations.Test;

public class DependsOnMethod
{
	@Test
	public void login()
	{
		org.testng.Assert.fail();
		System.out.println("login");
	}
	@Test(dependsOnMethods ="login")
	public void createWork()
	{
		System.out.println("Work created");
	}
	@Test(dependsOnMethods = "createWork")
	public void DelleteWork()
	{
		System.out.println("Work Delete");
	}
}
