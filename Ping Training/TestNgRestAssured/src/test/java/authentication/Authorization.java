package authentication;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Authorization {

	@Test
	public void BasicAuth() {

		RequestSpecification req = RestAssured.given();

		req.baseUri("http://postman-echo.com");
		req.basePath("/basic-auth");

		// Response response = req.auth().basic("postman","password").get();
		Response response = req.auth().preemptive().basic("postman", "password").get();

		System.out.println("Response status:" + response.statusLine());
		System.out.println("Response body:" + response.body().asString());
	}

	@Test
	public void DigestAuth() {

		RequestSpecification req = RestAssured.given();

		req.baseUri("http://httpbin.org");
		req.basePath("/digest-auth/undefined/Harsha/Harsha");

		// Response response = req.get();
		Response response = req.auth().digest("Harsha", "Harsha").get();

		Assert.assertEquals(response.statusCode(), 200, "Check for Status Code");

		// print Status line
		System.out.println("Response status:" + response.statusLine());
		System.out.println("Response body:" + response.body().asString());
	}

}
