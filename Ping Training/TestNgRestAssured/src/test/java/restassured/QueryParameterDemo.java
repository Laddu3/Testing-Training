package restassured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class QueryParameterDemo {
	
	@Test
	public void queryparameter()
	{
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI="https://reqres.in/api";
		RequestSpecification request=RestAssured.given();
		
		Response resp=request.queryParam("page", "2").get("/users");
		
		ResponseBody rb=resp.body();
		String respbody=rb.asString();
		JsonPath jpath=new JsonPath(respbody);
		String name=jpath.getString("data[3].first_name");
		System.out.println("The name of user is: "+name);
		
	}

}
