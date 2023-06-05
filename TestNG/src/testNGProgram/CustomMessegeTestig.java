package testNGProgram;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomMessegeTestig 
{
	@Test
	public void loginlogout()
	{
		List<String>list1=new ArrayList<>();
		list1.add("Motoo");
		list1.add("Cartoon");
		list1.add("Soumya");
		List<String>list2=new ArrayList<>();
		list2.add("chua");
		list2.add("devil"); 
		Assert.assertEquals(list1, list2,"Both list are not same");          
	}
}
