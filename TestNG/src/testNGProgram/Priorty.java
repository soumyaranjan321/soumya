package testNGProgram;

import org.testng.annotations.Test;

public class Priorty
{
	@Test(priority = 3)
	public void ipsita()
	{
		System.out.println("ipsita");
	}
	@Test(priority = 1)
	public void Harapriya()
	{
		System.out.println("Harapriya");
	}
	@Test(priority = 2)
	public void Anjali()
	{
		System.out.println("Anjali");
	}
	
	
}
