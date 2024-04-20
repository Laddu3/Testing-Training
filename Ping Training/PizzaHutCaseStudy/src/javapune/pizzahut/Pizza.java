package javapune.pizzahut;

public class Pizza {

	private String type;
	private String toppings;
	private String name;
	private float timeForPreparation;
	private int costOfPizza;
	private String size;
	
	
	public Pizza(String type, String toppings, String name, float timeForPreparation, String size) throws InvalidPizzaTypeException,InvalidPizzaSizeException {
		if(!(type.equalsIgnoreCase("veg") || type.equalsIgnoreCase("non-veg"))) {
			throw new InvalidPizzaTypeException("Invalid Type! only veg and non-veg are allowed");
		}else {
			this.type = type;
		}
		
		if(size.equalsIgnoreCase("small") || size.equalsIgnoreCase("medium")) {
			this.size = size;
		}else {
			throw new InvalidPizzaSizeException("Invalid Size!, Only small and medium size pizzas are available");
		}

		this.toppings = toppings;
		this.name = name;
		this.timeForPreparation = timeForPreparation;
	}
	
	
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getToppings() {
		return toppings;
	}

	public void setToppings(String toppings) {
		this.toppings = toppings;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getTimeForPreparation() {
		return timeForPreparation;
	}

	public void setTimeForPreparation(float timeForPreparation) {
		this.timeForPreparation = timeForPreparation;
	}

	public int getCostOfPizza() {
		return costOfPizza;
	}

	public void setCostOfPizza(int costOfPizza) {
		this.costOfPizza = costOfPizza;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	
	@Override
	public String toString() {
		return "Pizza details are: "+type+" "+name+" Pizza with "+size+" size and toppings "+toppings
				+" toppings which takes "+timeForPreparation+" min for preaparation. Total cost: $"+getCostOfPizza();
	}
	
}
