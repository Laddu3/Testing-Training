package java.abstractclass;

import java.util.Scanner;

public class Delivery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Pizza Type: (veg/non-veg): ");
		String type = scanner.nextLine().trim().toLowerCase();
		
		System.out.println("Enter pizza Size: (small/medium): ");
		String size = scanner.nextLine().trim().toLowerCase();
		
		System.out.println("Do you want to add Toppings: (Enter No is none): ");
		String toppings = scanner.nextLine().trim();
		
		ItalianPizza italianPizza = new ItalianPizza(type, toppings, "Margherita", 10, size);
		
		System.out.println(italianPizza);
		
		scanner.close();
	}

}
