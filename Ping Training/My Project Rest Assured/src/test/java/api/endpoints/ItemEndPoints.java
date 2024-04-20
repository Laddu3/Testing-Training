package api.endpoints;
 
import static io.restassured.RestAssured.given;

import api.payload.Item;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
 
public class ItemEndPoints {
 
	public static Response createItem(Item payload)
	{
		Response response = given()
		.accept(ContentType.JSON)
		.contentType(ContentType.JSON)
		.body(payload)
		.when()
		.post(Routes.post_url);
		return response;
	}

	public static Response getItems()
	{
		Response response = given()
		.accept(ContentType.JSON)
		.when()
		.get(Routes.get_url);
		return response;
	}

	public static Response updateItem(long id,Item Payload)
	{
		Response response = given()
		.accept(ContentType.JSON)
		.contentType(ContentType.JSON)
		.pathParam("itemid", id)
		.body(Payload)
		.when()
		.put(Routes.put_url);
		return response;
	}

	public static Response deleteItem(long id) {
		Response response = given()
				.accept(ContentType.JSON)
				.pathParam("itemid", id)
				.when()
				.delete(Routes.del_url);
				return response;
	}
 
 
	
}