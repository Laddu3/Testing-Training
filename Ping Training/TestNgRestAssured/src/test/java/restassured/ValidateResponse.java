package restassured;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ValidateResponse {
	//validate response
	//@Test
	public void getusers()
	{
		RestAssured.useRelaxedHTTPSValidation();
		
		RestAssured.baseURI="https://reqres.in/api/users?page=2";
		
		RequestSpecification request=RestAssured.given();
		
		Response response=request.get("");
		
		int statuscode=response.getStatusCode();
		
		Assert.assertEquals(statuscode, 201, "Incorrect status code");
	}
	
	//validate status line
	@Test
	public void checkstatusline()
	{
	
	RestAssured.useRelaxedHTTPSValidation();
	
	RestAssured.baseURI="https://reqres.in/api/users?page=2";
	
	RequestSpecification request=RestAssured.given();
	
	Response response=request.get("");
	
	String statusline=response.getStatusLine();
	
	System.out.println("The statusline of response is:"+statusline);
	
	Assert.assertEquals(statusline, "OK", "Incorrect status line");
	
	
	}
}
