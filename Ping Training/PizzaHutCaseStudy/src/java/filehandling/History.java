package java.filehandling;

import java.collections.Bill;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class History {

		private ArrayList<Bill> bills;

		public History() {
			bills = new ArrayList<Bill>();
		}

		public ArrayList<Bill> getBills() {
			return bills;
		}

		public void setBills(ArrayList<Bill> bills) {
			this.bills = bills;
		}
		
		
		public void saveHistory() {
			try(BufferedWriter writer = new BufferedWriter(new FileWriter("bills.txt"))) {
				for(Bill bill: bills) {
					writer.write(bill.toString());
					writer.newLine();
				}
				System.out.println("History saved successfully");
			}catch (IOException e) {
				System.out.println("Error saving History: "+e.getMessage());
			}
		}
		
		public void retriveBills() {
			try(BufferedReader reader = new BufferedReader(new FileReader("bills.txt"))) {
				String line;
				while((line = reader.readLine())!= null) {
					System.out.println(line.toString());
				}
				System.out.println("History retrived successfully");
			} catch (IOException e) {
				System.out.println("Error retrieving history: "+e.getMessage());
			}
		}
		
		public void displayBills() {
			
			for(Bill bill : bills) {
				System.out.println("Bill details: ");
				System.out.println("Bill No: "+bill.getBillNo());
				System.out.println("Customer Name: "+bill.getCustName());
				System.out.println("date: "+bill.getDate());
			//	System.out.println("Total Amount: "+bill.getTotal());
				System.out.println();
			}
			
		}
}
