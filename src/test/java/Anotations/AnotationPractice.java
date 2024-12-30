package Anotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnotationPractice {

	@AfterTest
	public void Alert2()
	{
	System.out.println("+++++++++++ Alert i will be the last+++++++++");	
	}
	
		@Test
		public void carLoanone()
		{	
			System.out.println("carLoan one");
		}
		
		@Test
		public void carLoantwo()
		{	
			System.out.println("carLoan two");
		}
		
		@Test
		public void carLoanthree()
		{	
			System.out.println("carLoan three");
		}
		
		@Test
		public void carLoanfour()
		{	
			System.out.println("carLoan four");
		}
		
		@Test
		public void personalsAccount()
		{
			System.out.println("personal Savings Account Creation Done");
		}
		
		@Test
		public void JointAccount()
		{
			System.out.println("joint Savings Account Creation Done");
		}
		
		@BeforeTest
		public void Alert()
		{
			System.out.println("++++++++Alert i will run firtst+++++++++");
		}
		
}