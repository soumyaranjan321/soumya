package testNGProgram;

import org.testng.annotations.Test;

public class invocationCount
{
	@Test(invocationCount = 5,priority = 3)
	public void Cartoon()
	{
		System.out.println("Cartoon");
	}
	@Test(invocationCount = 3,priority = 2)
	public void motoo() {
		System.out.println("Motoo");
	}
	@Test(invocationCount = 1,priority = 1)
	public void Soumya() 
	{
		System.out.println("Soumya");
	}
	@Test(invocationCount = 2)
	public void nil()
	{
		System.out.println("Anil");
	}
	

}
