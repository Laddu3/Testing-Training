package com.assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestCustomer {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Customer details");
		System.out.println("Enter custNo");
		String custNo=br.readLine();
		System.out.println("Enter custName");
		String custName=br.readLine();
		System.out.println("Enter category");
		String category=br.readLine();
		Customer customer=new Customer(custNo, custName, category);
		System.out.println("Customer Details are");
		System.out.println(customer);
		br.close();
	}

}
