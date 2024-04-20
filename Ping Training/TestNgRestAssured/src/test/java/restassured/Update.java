package restassured;
 
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
 
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
 
public class Update {
	public void testPut() {
		JSONObject request = new JSONObject();
		request.put("name", "Harsha");
		request.put("job", "Developer");
		System.out.println(request.toJSONString());
		baseURI ="https://reqres.in/api";
	   given().accept(ContentType.JSON).
				body(request.toJSONString()).
		when().
				put("/users/2").
		then().
				statusCode(200).log().all();
	}
	@Test(description = "Method to patch", priority = 1)
public void testPatch() {
		JSONObject request = new JSONObject();
		request.put("name", "Akarsh");
		request.put("job", "Tester");
		System.out.println(request.toJSONString());
		baseURI ="https://reqres.in/api";
	   given().accept(ContentType.JSON).
				body(request.toJSONString()).
		when().
				patch("/users/2").
		then().
				statusCode(200).log().all();
 
	}
	@Test(description = "Method to delete", priority = 2)
public void testpDelete() {
	JSONObject request = new JSONObject();
 
	System.out.println(request.toJSONString());
	baseURI ="https://reqres.in/api";
//   given().accept(ContentType.JSON).
//			body(request.toJSONString()).
	when().
			delete("/users/2").
	then().
			statusCode(204).log().all();
 
}
 
}