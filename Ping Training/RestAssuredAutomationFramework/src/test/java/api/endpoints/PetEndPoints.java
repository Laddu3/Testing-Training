package api.endpoints;
 
import static io.restassured.RestAssured.given;
 
import api.payload.Pet;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
 
public class PetEndPoints {
 
	public static Response createPet(Pet payload)
	{
		Response response = given()
		.accept(ContentType.JSON)
		.contentType(ContentType.JSON)
		.body(payload)

		.when()
		.post(Routes.pet_post_url);
		return response;
	}

	public static Response getPet(Integer id)
	{
		Response response = given()
		.accept(ContentType.JSON)
		.pathParam("id", id)
		.when()
		.get(Routes.pet_get_url);
		return response;
	}

	public static Response updatePet(Pet payload)
	{
		Response response = given()
		.accept(ContentType.JSON)
		.contentType(ContentType.JSON)
		.body(payload)

		.when()
		.put(Routes.pet_put_url);
		return response;
	}

	public static Response deletePet(Integer Id)
	{
		Response response = given()
		.accept(ContentType.JSON)
		.pathParam("id", Id)

		.when()
		.delete(Routes.pet_del_url);
		return response;
	}
 
 
	
}