package restassured;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;

public class CreateUserPost {

	@Test
	public void testPost() {
		JSONObject req = new JSONObject();
		req.put("name", "Harsha");
		req.put("job", "Developer");
		System.out.println(req.toJSONString());
		baseURI = "https://reqres.in/api";
		given().body(req.toJSONString()).when().post("/users").then().statusCode(201).log().all();
		;
	}
}