package api.testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.github.javafaker.Faker;

import api.endpoints.ItemEndPoints;
import api.payload.Item;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ItemTest {

	Faker faker;
	Item itemPayload;
	public static Logger logger;
	SoftAssert softAssert = new SoftAssert();

	@BeforeClass
	public void generateTestData() {
		RestAssured.useRelaxedHTTPSValidation();
		faker = new Faker();
		itemPayload = new Item();

		itemPayload.setId(faker.idNumber().hashCode());
		itemPayload.setItemName(faker.commerce().productName());
		itemPayload.setPrice(faker.number().randomDouble(3, 1, 100));

		// obtain logger

		logger = LogManager.getLogger("RestAssuredAutomationFramework_test");
	}

	@Test(priority = 1,description = "Adding item")
	public void testCreateItem() {
		RestAssured.useRelaxedHTTPSValidation();
		Response response = ItemEndPoints.createItem(itemPayload);

		// log response
		response.then().log().all();

		// validation
		softAssert.assertEquals(response.getStatusCode(), 200);

		// log
		logger.info("Create Item executed.");
	}

	@Test(priority = 2, dependsOnMethods = "testCreateItem",description = "Fetching all items")
	public void testGetItemsData() {
		RestAssured.useRelaxedHTTPSValidation();
		Response response = ItemEndPoints.getItems();

		System.out.println("Read Item Data.");
		// log response
		response.then().log().all();

		// validation
		softAssert.assertEquals(response.getStatusCode(), 200);

		// log
		logger.info("Get Item Data executed.");
	}

	@Test(priority = 3, dependsOnMethods = "testCreateItem",description = "Updating item by id")
	public void testUpdateItem() {
		itemPayload.setId(faker.idNumber().hashCode());
		Response response = ItemEndPoints.updateItem(this.itemPayload.getId(), itemPayload);

		// log response
		response.then().log().all();

		// validation
		softAssert.assertEquals(response.getStatusCode(), 200);

		// Read User data to check if first name is updated

		Response responsePostUpdate = ItemEndPoints.getItems();

		System.out.println("After Update User Data.");

		responsePostUpdate.then().log().all();

		// log
		logger.info("Update User executed.");

	}

	@Test(priority = 4, dependsOnMethods = "testCreateItem",description = "Deleting item by id")
	public void testDeleteItem() {
		RestAssured.useRelaxedHTTPSValidation();
		Response response = ItemEndPoints.deleteItem(this.itemPayload.getId());

		System.out.println("Delete Item Data.");

		// log response
		response.then().log().all();

		// validation
		softAssert.assertEquals(response.getStatusCode(), 200);
		//Assert.assertEquals(response.getStatusCode(), 300);

		// log
		logger.info("Delete Item executed.");

	}
}