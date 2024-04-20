package restassured;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestDemo {
	
	@BeforeSuite
	public void openBrowser() {
		System.out.println("Open the browser");
	}
	
	@BeforeMethod
	public void openFb() {
		System.out.println("Open facebook");
	}
	
	@BeforeClass
	public void SearchFriend() {
		System.out.println("Searching for Friends");
	}
	
	@BeforeTest
	public void sentRequest() {
		System.out.println("Sent friend request");
	}
	
	@Test
	public void acceptRequest() {
		System.out.println("Accept friend request");
	}
	
	@AfterSuite
	public void logOut() {
		System.out.println("Log out fb");
	}
	
	@AfterMethod
	public void closeBrowser() {
		System.out.println("close the browser");
	}

}
