package api.endpoints;

import java.net.URI;

public class Routes {

	public static String base_url = "http://localhost:9090/Admin";

//Item module urls
	public static String post_url = base_url + "/Additem";
	public static String get_url = base_url + "/Displayitems";
	public static String put_url = base_url + "/Updateitem/{itemid}";
	public static String del_url = base_url + "/Deleteitem/{itemid}";

}
