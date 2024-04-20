package pizzahut;

public class PizzaHut {

	public static void main(String[] args) {

		Customer cust = new Customer();
		cust.setCustNo(001);
		cust.setCustName("Harsha");
		cust.setCustAddr("proddatur");

		cust.display();
	}

}
