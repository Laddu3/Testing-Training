package java.inheritance;

public class ItalianPizza extends Pizza{

	public ItalianPizza(String type, String toppings, String name, float timeForPreparation) {
		super(type,toppings,name,timeForPreparation);
	}
	
	@Override
	public String toString() {
		return "Italian " +super.toString();
	}
}
