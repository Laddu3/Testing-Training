package api.testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import api.endpoints.PetEndPoints;
import api.endpoints.userEndPoints;
import api.payload.Pet;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PetTest {
	
	Faker faker;
	Pet petPayload;
	public static Logger logger;

	@BeforeClass
	public void generateTestData()
	{
		RestAssured.useRelaxedHTTPSValidation();
		faker = new Faker();
		petPayload = new Pet();

		petPayload.setPetId(faker.idNumber().hashCode());
		petPayload.setPetName(faker.name().username());
		petPayload.setStatus("available");


		//obtain logger

		logger = LogManager.getLogger("RestAssuredAutomationFramework_test");
	}

	@Test(priority=1)
	public void testCreatePet()
	{
		RestAssured.useRelaxedHTTPSValidation();
		Response response = PetEndPoints.createPet(petPayload);

		//log response
		response.then().log().all();


		//validation
		Assert.assertEquals(response.getStatusCode(),200);

		//log
		logger.info("Create User executed.");
	}


	@Test(priority=2)
	public void testGetPetData()
	{
		RestAssured.useRelaxedHTTPSValidation();
		Response response = PetEndPoints.getPet(this.petPayload.getPetId());

		System.out.println("Read pet Data.");
		//log response
		response.then().log().all();


		//validation
		Assert.assertEquals(response.getStatusCode(),404);

		//log
		logger.info("Get Pet Data executed.");
	}

	@Test(priority=3)
	public void testUpdatePet()
	{
		RestAssured.useRelaxedHTTPSValidation();
		petPayload.setPetName(faker.name().name());
		Response response = PetEndPoints.updatePet(this.petPayload.getPetId(),petPayload);


		//log response
		response.then().log().all();


		//validation
		Assert.assertEquals(response.getStatusCode(),405);

		//Read User data to check if first name is updated 

		Response responsePostUpdate = PetEndPoints.getPet(this.petPayload.getPetId());

		System.out.println("After Update Pet Data.");

		responsePostUpdate.then().log().all();

		//log
		logger.info("Update Pet executed.");

	}

	@Test(priority=4)
	public void testDeletePet()
	{

		Response response = PetEndPoints.deletePet(this.petPayload.getPetId());

		System.out.println("Delete Pet Data.");

		//log response
		response.then().log().all();


		//validation
		Assert.assertEquals(response.getStatusCode(),404);

		
		//log
				logger.info("Delete User executed.");


	}

}
