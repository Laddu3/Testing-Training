package authentication;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APIKeyAuthentication {

	@Test
	public void getWeather() {

		RestAssured.useRelaxedHTTPSValidation();

		RequestSpecification req = RestAssured.given();

		req.baseUri("https://api.openweathermap.org");
		req.basePath("/data/2.5/weather");
		req.queryParam("q", "delhi").queryParam("appid", "ec05cf1db4832915dc511b2bc945ce81");

		Response response = req.get();

		SoftAssert Assert = new SoftAssert();
		Assert.assertEquals(response.statusCode(), 200, "Check for Status Code");

		// print Status line
		System.out.println("Response status:" + response.statusLine());
		System.out.println("Response body:" + response.body().prettyPrint());

	}
}
