package java.inheritance;

public class Pizza {

	private String type;
	private String toppings;
	private String name;
	private float timeForPreparation;
	
	
	public Pizza() {
	}

	public Pizza(String type, String toppings, String name, float timeForPreparation) {
		if(type.equalsIgnoreCase("veg") || type.equalsIgnoreCase("non-veg")) {
			this.type = type;
		}else if(toppings.equalsIgnoreCase("no")) {
			this.toppings = toppings;
			this.name = name;
			this.timeForPreparation = timeForPreparation;
		}else {
			System.out.println("Invalid Type");
		}
	}

	@Override
	public String toString() {
		return "Pizza details are: "+type+" "+name+" Pizza with "+toppings
				+" toppings which takes "+timeForPreparation+" min for preaparation.";
	}
	
}
