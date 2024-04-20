package restassured;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class SingleUserGet {
	
		
		@Test
		public void listUsers()
		{
			RestAssured.useRelaxedHTTPSValidation();
			baseURI="https://reqres.in/api";
			
			given().
			  get("/api/users/2").
			then().
			  statusCode(200).
			  body("data.first_name", equalTo("Janet")).
			  log().
			  all();
		}

	}

