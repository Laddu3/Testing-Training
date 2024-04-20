package pojodemo;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class SerializationandDeserialization {
	
	@Test
	
	public void createjsonobject() throws JsonProcessingException
	{
		RestAssured.useRelaxedHTTPSValidation();
		Employee emp1=new Employee();
		emp1.setFirstname("Neha");
		emp1.setLastname("Gupta");
		emp1.setGender("Female");
		emp1.setAge(30);
		emp1.setSalary(30000);
		//convert emp1 pojo object to json object
		ObjectMapper objMapper=new ObjectMapper();
		String employeeJSON=objMapper.writerWithDefaultPrettyPrinter().writeValueAsString(emp1);
		
		System.out.println(employeeJSON);
		
		RequestSpecification request=RestAssured.given();
		request.baseUri("https://httpbin.org/post");
		request.contentType(ContentType.JSON);
		request.body(employeeJSON);
		
		Response resp=request.post();
		
		resp.prettyPrint();
		
		Assert.assertEquals(resp.statusCode(), 200, "Incorrect status code");
	
		//convert json to class object
		
		Employee emp2=objMapper.readValue(employeeJSON,Employee.class);
		
		System.out.println("******print after json object converted to class object*****");
		System.out.println("Firstname is: "+emp2.getFirstname());
		System.out.println("Laststname is: "+emp2.getLastname());
		System.out.println("Gender is: "+emp2.getGender());
		System.out.println("Age is: "+emp2.getAge());
		System.out.println("Salary is: "+emp2.getSalary());
	}

}
