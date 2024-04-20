package javapune.pizzahut;


public class ItalianPizza extends Pizza{

	public ItalianPizza(String type, String toppings, String name, float timeForPreparation, String size) throws InvalidPizzaTypeException, InvalidPizzaSizeException {
		super(type,toppings,name,timeForPreparation,size);
	}
	
	public int calculateCost() {
		int totalCoast = getCostOfPizza();
		
		if(getSize().equalsIgnoreCase("small")) {
			totalCoast += (getType().equalsIgnoreCase("veg")) ? 200 : 270;
		} else if(getSize().equalsIgnoreCase("medium")) {
			totalCoast += (getType().equalsIgnoreCase("veg")) ? 350 : 420;
		}
		
		if(!getToppings().equalsIgnoreCase("no")) {
			totalCoast += 30;
		}
		
		return totalCoast;
	}

	@Override
	public String toString() {
		return "Italian " + super.toString();
	}
}
