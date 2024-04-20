package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependenciesDemo {

	@Test(description = "Sent friend request")
	public void sendRequest() {
		System.out.println("Sent friend request");
		
	}

	@Test(dependsOnMethods = "sendRequest", description = "Accepted friend request")
	public void acceptRequest() {
		System.out.println("Accept friend request");
		Assert.assertEquals("Fb", "fb");
	}

	@Test(dependsOnMethods = "acceptRequest", description = "Deleted friend request" )
	public void deleteRequest() {
		System.out.println("Delete friend request");
	}

}
