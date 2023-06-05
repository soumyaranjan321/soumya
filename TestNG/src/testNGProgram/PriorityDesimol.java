package testNGProgram;

import org.testng.annotations.Test;

public class PriorityDesimol 
{
	@Test(priority = -9)
	public void ipsita()
	{
		System.out.println("Ipsita");
	}
	@Test(priority = -5)
	public void Harapriya()
	{
		System.out.println("Harapriya");
	}
	@Test(priority = 3)
	public void anjali()
	{
		System.out.println("Ajali");
	}

}
