package testNGProgram;

import org.testng.annotations.Test;

public class DefaultPriority 
{
	@Test(priority = 1)
	public void Ipsita()
	{
		System.out.println("ipsita");
	}
	@Test
	public void Harapriya() {
		System.out.println("Haraprya");
	}
	@Test(priority = 2)
	public void Anjali()
	{
		System.out.println("Anjali");
	}
}
