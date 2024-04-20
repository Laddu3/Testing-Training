package java.filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CustomerReport {

	public void storeReport(Customer customer) {
		try(BufferedWriter fileWriter = new BufferedWriter(new FileWriter("CustomerRecords.txt"))) {
			PrintWriter printWriter = new PrintWriter(fileWriter);
			printWriter.println(customer.getCustNo()+"\t\t"+customer.getCustName()+"\t\t"+customer.getCustAddr());
			printWriter.close();
			fileWriter.close();
			System.out.println("Customer report stored successfully");
		}catch (IOException e) {
			System.out.println("Error storing customer report : "+e.getMessage());
		}
	}
}
