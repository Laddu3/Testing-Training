package java.inheritance;

import java.util.Scanner;

public class PizzaHut {

	public static void main(String[] args) {

		try(Scanner scanner = new Scanner(System.in)) {
			String choice;
			
			do {
				System.out.println("Choose pizza type: Italian or Mexian (type 'exit' to quit): ");
				choice = scanner.nextLine().trim().toLowerCase();
				
				if(!choice.equals("exit")) {
					System.out.println("Enter pizza type (veg/non-veg): ");
					String type = scanner.nextLine().trim().toLowerCase();
					
					System.out.println("Enter pizza name: ");
					String name = scanner.nextLine().trim();
					
					System.out.println("Enter time for preparation (in minutes): ");
					float time = Float.parseFloat(scanner.nextLine().trim());
					
					System.out.println("Enter toppings : ");
					String toppings = scanner.nextLine().trim();
					
					if(choice.equals("italian")) {
						ItalianPizza italianPizza = new ItalianPizza(type, toppings, name, time);
						System.out.println(italianPizza);
					}else if (choice.equals("mexican")) {
						MexicanPizza mexicanPizza = new MexicanPizza(type, toppings, name, time);
						System.out.println(mexicanPizza);
					}else {
						System.out.println("Invalid choice. Please choose Italian or Mexican");
					}
					
				}
			}while(!choice.equals("exit"));
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
