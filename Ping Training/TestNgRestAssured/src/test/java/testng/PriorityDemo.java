package testng;

import org.testng.annotations.Test;

public class PriorityDemo {
	
	

	@Test(description="Sent friend request" )
	public void sendRequest() {
		System.out.println("Sent friend request");
	}
	
	@Test(priority=2, description="Accepted friend request" )
	public void acceptRequest() {
		System.out.println("Accept friend request");
	}
	
	@Test(priority=1, description="Deleted friend request" )
	public void deleteRequest() {
		System.out.println("Delete friend request");
	}

}
