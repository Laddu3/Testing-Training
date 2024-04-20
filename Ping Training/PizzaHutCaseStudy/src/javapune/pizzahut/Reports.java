package javapune.pizzahut;

import java.util.*;
import java.util.Scanner;



public class Reports {

	public static void main(String[] args) throws InvalidPizzaTypeException, InvalidPizzaSizeException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Pizza Type: (veg/non-veg): ");
		String type = scanner.nextLine().trim().toLowerCase();
		
		System.out.println("Enter pizza Size: (small/medium): ");
		String size = scanner.nextLine().trim().toLowerCase();
		
		System.out.println("Do you want to add Toppings: (Enter No is none): ");
		String toppings = scanner.nextLine().trim();
		
		ItalianPizza italianPizza = new ItalianPizza(type, toppings, "Margherita", 10, size);
		
		
		System.out.println("Enter Bill No : ");
		int billNo = scanner.nextInt();
		System.out.println("Enter customer name : ");
		String name = scanner.next();
		scanner.nextLine();
		Date date = new Date();
//		System.out.println("Enter bill date (in yyyy-mm-dd format): ");
//		String orderdateString = scanner.nextLine();
//		Date date = Date.valueOf(orderdateString);
		
		System.out.println("Enter items list : ");
		String[] items = scanner.next().trim().split(",");
		
		Bill bill = new Bill(billNo, name, date,italianPizza.calculateCost(), new String[] {italianPizza.getName()});
		
		BillReports reports = new BillReports(10);
		reports.addBill(bill);
		
		Bill[] bills = reports.getBills();
		for(Bill b : bills) {
			if(b!=null) {
				System.out.println("Bill No: "+b.getBillNo()+", Customer Name: "+b.getCustName()+", Total: "+b.getTotal());
			}
		}
		
		System.out.println("Enter bill number to update: ");
		int billNo1 = scanner.nextInt();
		System.out.println("Enter new Total: ");
		int newTotal = scanner.nextInt();
		boolean updated = reports.updateBill(billNo1, newTotal);
		if(updated) {
			System.out.println("Bill updated Successfully!!");
		}else {
			System.out.println("Bill not found");
		}
		
		
		System.out.println("Enter bill number to search: ");
		int searchBillNo = scanner.nextInt();
		try {
			Bill searchedBill = reports.searchBill(searchBillNo);
			System.out.println("Bill No: "+searchedBill.getBillNo()+", Customer Name: "+searchedBill.getCustName()+", Total: "+searchedBill.getTotal());
		}catch (BillNotFoundException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		scanner.close();
	}

}
