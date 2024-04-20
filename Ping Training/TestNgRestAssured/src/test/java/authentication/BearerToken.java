package authentication;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.json.simple.JSONObject;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BearerToken {

	@Test
	public void token() {
		RestAssured.useRelaxedHTTPSValidation();
		RequestSpecification req = RestAssured.given();
		req.baseUri("https://gorest.co.in");
		req.basePath("/public/v2/users");

		JSONObject obj = new JSONObject();

		obj.put("name", "Harsha");
		obj.put("gender", "Male");
		obj.put("email", "harsha123@gmail.com");
		obj.put("status", "Active");

		String AuthToken = "Bearer e8303f44a4a8a2feefc1622e97d260399cc9399037c1995808ead85bb732a88c";

		req.headers("Authorization", AuthToken).contentType(ContentType.JSON).body(obj.toJSONString());

		Response response = req.post();

		SoftAssert Assert = new SoftAssert();
		Assert.assertEquals(response.statusCode(), 201, "Check for Status Code");

		// print Status line
		System.out.println("Response status:" + response.statusLine());
		System.out.println("Response body:" + response.body().asString());

	}

}
