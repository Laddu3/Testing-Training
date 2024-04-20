package api.endpoints;

import static io.restassured.RestAssured.given;

import java.util.ResourceBundle;

import api.payload.Item;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class ItemEndPoints2 {

	static ResourceBundle getURL()
	{
		ResourceBundle routes = ResourceBundle.getBundle("Routes");//load Routes.properties
		return routes;
	}
	
	public static Response createUser(Item payload)
	{
		String post_url = getURL().getString("post_url");
		Response response = given()
		.accept(ContentType.JSON)
		.contentType(ContentType.JSON)
		.body(payload)
		
		
		.when()
		.post(post_url);
		
		return response;
	}
	
	
	public static Response GetUser()
	{
		String get_url = getURL().getString("get_url");

		Response response = given()
		.accept(ContentType.JSON)
		.when()
		.get(get_url);
		
		return response;
	}
	
	public static Response updateItem(long id,Item Payload)
	{
		
		String put_url = getURL().getString("update_url");

		
		Response response = given()
		.accept(ContentType.JSON)
		.contentType(ContentType.JSON)
		.pathParam("itemid", id)
		.body(Payload)
		.when()
		.put(put_url);
		
		return response;
	}
	
	
	public static Response deleteItem(long id)
	{
		String del_url = getURL().getString("delete_url");

		Response response = given()
		.accept(ContentType.JSON)
		.pathParam("itemid", id)
		.when()
		.delete(del_url);
		
		return response;
	}
	
}
