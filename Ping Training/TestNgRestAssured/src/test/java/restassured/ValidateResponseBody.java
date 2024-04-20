package restassured;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class ValidateResponseBody {
	//convert response body to upper case
//@Test
	public void getusers()
	{
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI="https://reqres.in/api";
		RequestSpecification request=RestAssured.given();
		Response response=request.get("/users?page=2");
		ResponseBody rb=response.getBody();
		//System.out.println("Response body is" +rb.asString());
		
		String responsebody=rb.asString();
		//Assert.assertEquals(responsebody.contains("Byron"), true,"Incorrect response body");
		
		System.out.println(responsebody);
		
		Assert.assertEquals(responsebody.toUpperCase().contains("byron"),true,"Incorrect response value");
		
	}
	//to check for first names and print all first names
	//@Test
	public void verifyresponse()
	{
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI="https://reqres.in/api";
		RequestSpecification request=RestAssured.given();
		Response response=request.get("/users?page=2");
		
		JsonPath val=response.jsonPath();
		
		String firstname=val.get("data[3].first_name");
		System.out.println("First name is:"+firstname);
		Assert.assertEquals(firstname, "Byron", "Incorrect first name");
		
		List<String> firstnames=val.get("data.first_name");
		System.out.println("First Names are: "+firstnames);
		//Assert.assertEquals(firstnames.contains("Byron"), true, "Byron not found");
		Assert.assertEquals(firstnames.containsAll(firstnames), true, "Few names missing");
	}
	@Test
	public void displayallvalues()
	{
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI="https://reqres.in/api";
		RequestSpecification request=RestAssured.given();
		Response response=request.get("/users?page=2");
		
		JsonPath val=response.jsonPath();
		System.out.println("Page received from response: "+val.get("page"));
		System.out.println("Data received from response: "+val.get("data.id"));
		System.out.println("Email received from response: "+val.get("data.email"));
		System.out.println("First name received from response: "+val.get("data.first_name"));
		System.out.println("Last name from response: "+val.get("data.last_name"));
		System.out.println("Total received from response: "+val.get("total"));
		
		
	}

}
