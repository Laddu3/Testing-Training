package api.endpoints;

import static io.restassured.RestAssured.given;

import api.payload.Pet;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PetEndPoints {

	public static Response createPet(Pet payload) {
		Response response = given().accept(ContentType.JSON).contentType(ContentType.JSON).body(payload)

				.when().post(Routes.post_url);

		return response;
	}

	public static Response getPet(int petId) {
		Response response = given().accept(ContentType.JSON).pathParam("petId", petId)

				.when().get(Routes.get_url);

		return response;
	}

	public static Response updatePet(int petId, Pet payload) {
		Response response = given().accept(ContentType.JSON).contentType(ContentType.JSON).pathParam("petId", petId)
				.body(payload)

				.when().put(Routes.put_url);

		return response;
	}

	public static Response deletePet(int petId) {
		Response response = given().accept(ContentType.JSON).pathParam("petId", petId)

				.when().delete(Routes.del_url);

		return response;
	}

}
