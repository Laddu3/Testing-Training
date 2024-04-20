package java.filehandling;

import java.util.Scanner;

public class Reception2 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Customer customer = null;
			CustomerReport report = new  CustomerReport();
				  
				  for(int i=0;i<2;i++) {
					  System.out.println("enter customer number: "); 
				 int  custNo = sc.nextInt();
				 System.out.println("Enter customer name: "); 
				 String custName = sc.next(); 
				 System.out.println("Enter customer Address : "); 
				 String custAddr = sc.next(); 
				 customer = new Customer(custNo,custName,custAddr);
				  report.storeReport(customer);
				  System.out.println(customer);
	}
				  System.out.println("CustomerNo\tCustomerName\tCustomerAddress");
				  
}
}
}
