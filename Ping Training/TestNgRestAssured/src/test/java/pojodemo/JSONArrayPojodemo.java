package pojodemo;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class JSONArrayPojodemo {

	@Test
	public void createemployeeJsonarray() throws JsonProcessingException {
		RestAssured.useRelaxedHTTPSValidation();
		Employee emp1 = new Employee();
		emp1.setFirstname("Meghna");
		emp1.setLastname("Sharma");
		emp1.setGender("Female");
		emp1.setAge(30);
		emp1.setSalary(20000);

		Employee emp2 = new Employee();
		emp2.setFirstname("Neeta");
		emp2.setLastname("Verma");
		emp2.setGender("Female");
		emp2.setAge(28);
		emp2.setSalary(30000);

		Employee emp3 = new Employee();
		emp3.setFirstname("Veena");
		emp3.setLastname("Singh");
		emp3.setGender("Female");
		emp3.setAge(32);
		emp3.setSalary(50000);

		List<Employee> listofemp = new ArrayList<Employee>();

		listofemp.add(emp1);
		listofemp.add(emp2);
		listofemp.add(emp3);

		// converting employee class object(emp1,emp2,emp3) to json array payload as
		// string

		ObjectMapper objMapper = new ObjectMapper();
		String jsonArraypayload = objMapper.writerWithDefaultPrettyPrinter().writeValueAsString(listofemp);

		System.out.println("employee class objects to json array payloads");
		System.out.println(jsonArraypayload);

		RequestSpecification request = RestAssured.given();
		// request.baseUri("https://reqres.in/api/users");

		request.baseUri("https://httpbin.org/post");

		request.contentType(ContentType.JSON);
		request.body(jsonArraypayload);

		Response response = request.post();
		System.out.println("*************Response Body**********");

		response.prettyPrint();

		Assert.assertEquals(response.statusCode(), 200, "Incorrect status code");

		// convert jsonarray to Employee class object(deserialization)

		ResponseBody rb = response.getBody();

		JsonPath jsonpathview = rb.jsonPath();
		List<Employee> allemployees = jsonpathview.getList("json", Employee.class);
		System.out.println("************Employee object in response body*************");
		// System.out.println(allemployees);
		for (Employee emp : allemployees) {
			System.out.println(emp.getFirstname() + " " + emp.getLastname());
		}
	}
}
