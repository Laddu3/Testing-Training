package java.inheritance;

public class MexicanPizza extends Pizza{
	
	public MexicanPizza(String type, String toppings, String name, float timeForPreparation) {
		super(type,toppings,name,timeForPreparation);
	}
	
	@Override
	public String toString() {
		return "Mexican " +super.toString();
	}
}
