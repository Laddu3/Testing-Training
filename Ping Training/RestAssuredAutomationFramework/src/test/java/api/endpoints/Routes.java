package api.endpoints;

public class Routes {

	/*Create User	POST	https://petstore.swagger.io/v2/user
Get User	GET	https://petstore.swagger.io/v2/user/{username}
Update User	PUT	https://petstore.swagger.io/v2/user/{username}
Delete User	DELETE	https://petstore.swagger.io/v2/user/{username}
*/

public static String base_url = "https://petstore.swagger.io/v2";
	
//user module urls
public static String  post_url = base_url + "/user";
public static String  get_url = base_url + "/user/{username}";
public static String  put_url = base_url + "/user/{username}";
public static String  del_url = base_url + "/user/{username}";


//pet module urls

public static String pet_post_url = base_url + "/pet";
public static String pet_get_url = base_url + "/pet/{id}";
public static String pet_put_url = base_url + "/pet";
public static String pet_del_url = base_url + "/pet/{id}";



//store module urls


}
