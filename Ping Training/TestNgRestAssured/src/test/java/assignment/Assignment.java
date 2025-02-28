package assignment;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Assignment {

	// Write a test to verify that fetching a post from
	// https://jsonplaceholder.typicode.com/posts/1
	// returns a response body where the userId is 1.
	//@Test
	public void fetching() {
		RestAssured.useRelaxedHTTPSValidation();
		baseURI = "https://jsonplaceholder.typicode.com";
		given().get("/posts/1").then().statusCode(200).log().all();

	}

	// Ensure that a GET request to https://jsonplaceholder.typicode.com/posts/1
	// returns a Content-Type header of application/json; charset=utf-8.
	//@Test(priority = 1)
	public void Get() {
		RestAssured.useRelaxedHTTPSValidation();
		baseURI = "https://jsonplaceholder.typicode.com";
		Response response = given().header("Content-Type", "application/json; charset=utf-8").when().get("/posts/1");
		response.then().assertThat().statusCode(200).and().header("Content-Type",
				equalTo("application/json; charset=utf-8"));
	}

	// Using path parameters, write a test to fetch a comment with id 1 from
	// https://jsonplaceholder.typicode.com/comments/{id} and validate the email in
	// the response is Eliseo@gardner.biz
	//@Test(priority = 2)
	public void pathParams() {
		RestAssured.useRelaxedHTTPSValidation();
		baseURI = "https://jsonplaceholder.typicode.com";
		Response response = given().pathParam("id", 1).when().get("/comments/{id}");
		response.then().assertThat().statusCode(200).and().body("email", equalTo("Eliseo@gardner.biz"));
	}

	// Write a test to search for posts by userId using query parameters. Use
	// https://jsonplaceholder.typicode.com/posts with userId=1 and verify that the
	// response contains multiple posts.
	//@Test(priority = 3)
	public void search() {
		RestAssured.useRelaxedHTTPSValidation();
		baseURI = "https://jsonplaceholder.typicode.com";
		Response response = given().queryParam("userId", 1).when().get("/posts");
		response.then().assertThat().statusCode(200).and().body("size()", greaterThan(0));
	}

	// Perform a GET request to https://jsonplaceholder.typicode.com/posts/1
	// and extract the title of the post from the response has context menu
	@Test(priority = 4)
	public void context() {
		RestAssured.useRelaxedHTTPSValidation();
		baseURI = "https://jsonplaceholder.typicode.com";
		Response response = given().get("/posts/1");
		String title = response.jsonPath().getString("title");
		System.out.println("The title of the post is: " + title);
	}

}
