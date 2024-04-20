package restassured;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
 
public class ListUsersGet {
 
	@Test
	public void listUsers() {
 
		baseURI = "https://reqres.in/api";
		given().get("/users?page=1").then().statusCode(200).log().all();
	}
 
}