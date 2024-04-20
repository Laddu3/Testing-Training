package javapune.pizzahut;

import java.sql.Date;
import java.util.Scanner;

public class Reception {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("Enter order no: ");
		int orderNo = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter order date (in yyyy-mm-dd format): ");
		String orderdateString = scanner.nextLine();
		Date orderDate = Date.valueOf(orderdateString);
		System.out.println("Enter cost: ");
		int cost = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter Consumer name: ");
		String custName = scanner.nextLine();
		System.out.println("Enter customer address: ");
		String custAddress = scanner.nextLine();
		System.out.println("Enter approximate distance (in km): ");
		int approxDistance = scanner.nextInt();
		
		Order order = new Order(orderNo, orderDate, cost, custName, custAddress, approxDistance);
		
		boolean isDeliverable = order.delivery();
		if(isDeliverable) {
			System.out.println("Your order is deliverable!");
		}else {
			System.out.println("Sorry! your order is not deliverable.");
		}
		scanner.close();
	}
}
