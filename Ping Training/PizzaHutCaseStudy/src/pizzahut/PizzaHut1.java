package pizzahut;

import java.util.Scanner;

public class PizzaHut1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CustomerReport obj = new CustomerReport(5);
		for (int i = 1; i <= 5; i++) {
			System.out.println("Enter Customer number: ");
			int n = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter customer name: ");
			String name = sc.nextLine();
			System.out.println("Enter customer address: ");
			String addr = sc.nextLine();
			Customer c = new Customer();
			obj.addCustomer(c);
			System.out.println("");
		}
		obj.printList();
	}

}