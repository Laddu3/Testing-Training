package api.testcases;
 
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.github.javafaker.Faker;
 
import api.endpoints.PetEndPoints;
import api.payload.Pet;
import io.restassured.RestAssured;
import io.restassured.response.Response;
 
public class PetTest {
 
	Faker faker;
	Pet petPayload;
	public static Logger logger;
	
	SoftAssert softAssert;
 
	@BeforeClass
	public void generateTestData()
	{
		RestAssured.useRelaxedHTTPSValidation();
		faker = new Faker();
		petPayload = new Pet();
 
		petPayload.setId(faker.idNumber().hashCode());
		petPayload.setName(faker.name().name());
		petPayload.setStatus("avaliable");

 
		//obtain logger
 
		logger = LogManager.getLogger("RestAssuredAutomationFramework_test");
	}
 
	@Test(priority=1)
	public void testCreatePet()
	{
		SoftAssert softAssert = new SoftAssert();
		RestAssured.useRelaxedHTTPSValidation();
		Response response = PetEndPoints.createPet(petPayload);
 
		//log response
		response.then().log().all();
 
 
		//validation
		softAssert.assertEquals(response.getStatusCode(),200);
 
		//log
		logger.info("Create Pet executed.");
	}
 
 
	@Test(priority=2,dependsOnMethods = "testCreatePet")
	public void testGetPetData()
	{
		SoftAssert softAssert = new SoftAssert();
		RestAssured.useRelaxedHTTPSValidation();
		Response response = PetEndPoints.getPet(this.petPayload.getId());
 
		System.out.println("Read Pet Data.");
		//log response
		response.then().log().all();
 
 
		//validation
		softAssert.assertEquals(response.getStatusCode(),200);
 
		//log
		logger.info("Get Pet Data executed.");
	}
 
	@Test(priority=3,dependsOnMethods = "testCreatePet")
	public void testUpdatePet()
	{
		SoftAssert softAssert = new SoftAssert();
		RestAssured.useRelaxedHTTPSValidation();
		petPayload.setName(faker.name().name());
		Response response = PetEndPoints.updatePet(petPayload);
 
 
		//log response
		response.then().log().all();
 
 
		//validation
		softAssert.assertEquals(response.getStatusCode(),200);
 
		//Read pet data to check if name is updated
 
		Response responsePostUpdate =PetEndPoints.getPet(this.petPayload.getId());
 
		System.out.println("After Update User Data.");
 
		responsePostUpdate.then().log().all();
 
		//log
		logger.info("Update User executed.");
 
	}
 
	@Test(priority=4,dependsOnMethods = "testCreatePet")
	public void testDeletePet()
	{
		SoftAssert softAssert = new SoftAssert();
		RestAssured.useRelaxedHTTPSValidation();
		Response response = PetEndPoints.deletePet(this.petPayload.getId());
 
		System.out.println("Delete Pet Data.");
 
		//log response
		response.then().log().all();
 
 
		//validation
		softAssert.assertEquals(response.getStatusCode(),200);
 
		
		//log
				logger.info("Delete Pet executed.");
 
 
	}
}