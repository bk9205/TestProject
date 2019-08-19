package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestB {
	
	
	
	@Test
	public void TestB() {
		
		String expVal= "A";
		String actVal= "A";
		
		//Assert.assertEquals(actVal, expVal);
		//Assert.assertTrue(2>3, "some Error  message");
		
		Assert.fail("Error message");
		}
 
}
 