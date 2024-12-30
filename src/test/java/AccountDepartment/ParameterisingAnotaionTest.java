package AccountDepartment;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class ParameterisingAnotaionTest {
	
	
	@Test
	public void personalsAccount(String get_url)
	{
		System.out.println("personal Savings Account Creation Done");
		System.out.println(get_url);
	}
	
	@Test
	public void JointAccount()
	{
		System.out.println("joint Savings Account Creation Done");
	}

}
