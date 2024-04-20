package java.filehandling;

import java.collections.Bill;
import java.util.Date;
import java.util.Scanner;

public class Reception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		History history = new History();
		
		while(true) {
			System.out.println("Menu:");
			System.out.println("1. Create bills");
			System.out.println("2. Save to File");
			System.out.println("3. Retrieve from File");
			System.out.println("4. Exit");
			System.out.println("Enter your choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			switch (choice){
			case 1: {
				
				createBills(scanner, history);
				break;
			}
			case 2: {
				history.saveHistory();
				break;
			}
			case 3:
			{
				history.retriveBills();
				history.displayBills();
				break;
			}
			case 4:
			{
				System.out.println("Exiting.....");
				scanner.close();
				System.exit(0);
			}
			default:
				throw new IllegalArgumentException("Invalid Choice : " + choice);
			}
		}

	}
	
	public static void createBills(Scanner scanner, History history) {
		for(int i=0; i<5;i++) {
			//System.out.println("Creating Bill: "+(i+1));
			System.out.println("Enter bill number : ");
			int billNo = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter customer name: ");
			String name1 = scanner.nextLine();
			Date date = new Date();
			
			Bill bill = new Bill(billNo, name1, date);
			history.getBills().add(bill);
		}
	}

}
