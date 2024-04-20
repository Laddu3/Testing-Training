package restassured;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class RegisterSuccessful {
	@Test
	public void testpost()
	{
		JSONObject request=new JSONObject();
		
		request.put("email", "eve.holt@reqres.in");
		request.put("password", "pistol");
	
		
		System.out.println(request.toJSONString());
		
		baseURI="https://reqres.in/api";
		
		given().
		  body(request.toJSONString()).
		when().
		  post("/register").
		then().
		  statusCode(200).
		  log().all();
	}

}

