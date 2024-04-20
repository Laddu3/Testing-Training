package java.multithreading;

import java.util.Scanner;

import javapune.pizzahut.InvalidPizzaSizeException;
import javapune.pizzahut.InvalidPizzaTypeException;

public class PizzaHut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter pizza type (veg/non-veg): ");
		String type = scanner.nextLine().trim().toLowerCase();
		
		System.out.println("Enter pizza name: ");
		String name = scanner.nextLine().trim();
		
		System.out.println("Enter time for preparation (in minutes): ");
		float time = Float.parseFloat(scanner.nextLine().trim());
		
		System.out.println("Enter toppings : ");
		String toppings = scanner.nextLine().trim();
		
		System.out.println("Enter pizza Size (small/medium): ");
		String size = scanner.nextLine().trim().toLowerCase();
		
		Pizza pizza;
		try {
			pizza = new Pizza(type, toppings, name, time, size);
		} catch (InvalidPizzaTypeException | InvalidPizzaSizeException e) {
			System.out.println("Error: "+e.getMessage());
			return;
		}
		
		
		CookThread cookThread  = new CookThread("CookThread", pizza);
		cookThread.start();
		
		WaiterThread waiterThread = new WaiterThread("WaiterThread", pizza);
		waiterThread.start();
		
		scanner.close();
	}

}
