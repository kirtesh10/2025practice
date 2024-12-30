package Anotations;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforAfterClass {
	
	@Test
	public void beforaclass()
	{
		System.out.println("I am kirtesh's cloass");
	}
	
	@BeforeClass
	public void beforafterclass()
	{
		System.out.println("I am befor cloass");
	}

}
