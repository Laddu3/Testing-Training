package restassured;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ValidateHeaders {
	//@Test
	public void getheaderdetails()
	{
	
	RestAssured.useRelaxedHTTPSValidation();
	
	RestAssured.baseURI="https://reqres.in/api/users?page=2";
	
	RequestSpecification request=RestAssured.given();
	
	Response response=request.get("");
	
	Headers headervalues=response.headers();
	
	//System.out.println(headervalues);
	
	for(Header header:headervalues)
	{
		System.out.println("Key:"+header.getName()+ "Value: "+header.getValue());
	}
}
	@Test
	public void getuserheader()
	{
		RestAssured.useRelaxedHTTPSValidation();
		
		RestAssured.baseURI="https://reqres.in/api/users?page=2";
		
		RequestSpecification request=RestAssured.given();
		
		Response response=request.get("");
		
		String contenttype=response.header("Content-Type");
		
		System.out.println("Content type is: "+contenttype);
		Assert.assertEquals(contenttype, "application/json; charset=utf-8");
		
        String servername=response.header("Server");
		System.out.println("Server name is: "+servername);
		Assert.assertEquals(servername,"cloudflare");
		
	}
	
}
