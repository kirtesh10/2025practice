package Anotations;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforAfterMethodAnotation {
	
	@BeforeMethod
	public void perentmethod()
	{
		System.out.println("--------I Will Run Befor Each Mehtod---------");
	}
	@Test
	public void PersonalLoanone()
	{	
		System.out.println("PersonalLoan one");
	}
	
	@Test
	public void PersonalLoantwo()
	{	
		System.out.println("PersonalLoan two");
	}
	
	@Test
	public void PersonalLoanthree()
	{	
		System.out.println("PersonalLoan three");
	}
	
	@Test
	public void PersonalLoanfour()
	{	
		System.out.println("PersonalLoan four");
	}

}
