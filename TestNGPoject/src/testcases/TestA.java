package testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestA {
	@BeforeTest
	public void Test1() {
		System.out.println("Open Browser");
		
	}
	@AfterTest
	public void Test2() {
		System.out.println("Close Browser");
		
	}
	@Test(priority=1)
	public void doLogin() {
		
		System.out.println("Do Login Test");
	}
	@Test(priority=2)
	public void doPasswordChange() {
		
		System.out.println("Changing Password");
	}
	@Test(priority=3)
	public void doLogout() {
		
		System.out.println("Logging out");
	}
}
