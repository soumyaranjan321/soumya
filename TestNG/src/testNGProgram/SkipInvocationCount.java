package testNGProgram;

import org.testng.annotations.Test;

public class SkipInvocationCount
{
	@Test(invocationCount = 2)
	public void Motoo()
	{
		System.out.println("Motoo");
	}
	@Test(priority = 1,invocationCount =0)
	public void Cartoon()
	{
		System.out.println("Soumya");
	}
	@Test(invocationCount = 3)
	public void Anil()
	{
		System.out.println("Anil");
	}

}
