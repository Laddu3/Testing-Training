package java.collections;

import java.inheritance.ItalianPizza;
import java.inheritance.MexicanPizza;
import java.multithreading.Pizza;
import java.util.Date;
import java.util.Scanner;

import javapune.pizzahut.InvalidPizzaSizeException;
import javapune.pizzahut.InvalidPizzaTypeException;

public class Reception {
	public static void main(String[] args) throws InvalidPizzaTypeException, InvalidPizzaSizeException {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter bill number : ");
		int billNo = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter customer name: ");
		String name1 = scanner.nextLine();
		Date date = new Date();
		
		Bill bill = new Bill(billNo, name1, date);
		
		String choice;
		do {
			System.out.println("Choose pizza type: Italian or Mexcian (type 'exit' to quit): ");
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
				
				System.out.println("Enter the size: ");
				String size = scanner.nextLine();
				
				if(choice.equals("italian")) {
					Pizza italianPizza = new Pizza(type, toppings, name, time, size);
					bill.addPizza(italianPizza);
					System.out.println(italianPizza);
				}else if (choice.equals("mexican")) {
					Pizza mexicanPizza = new Pizza(type, toppings, name, time, size);
					bill.addPizza(mexicanPizza);
					System.out.println(mexicanPizza);
				}else {
					System.out.println("Invalid choice. Please choose Italian or Mexican");
				}
				
			}
		}while(!choice.equals("exit"));
		
		System.out.println("Bill details: ");
		System.out.println("Bill No: "+bill.getBillNo());
		System.out.println("Customer Name: "+bill.getCustName());
		System.out.println("date: "+bill.getDate());
		System.out.println("Total Amount: "+bill.getTotal());
		
		scanner.close();
	}
}
