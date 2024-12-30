package Anotations;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BeforSuitAfterSuit {
	
	
	@BeforeSuite
	public void perentfirst()
	
	{
		System.out.println("I am the @BeforeSuite perent");
	}
	
	@AfterSuite
	public void perentlast()
	
	{
		System.out.println("I am the @AfterSuite perent");
	}
}
