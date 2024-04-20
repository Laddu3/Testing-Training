package com.hashmap;

import java.util.HashMap;

public class Student {

	HashMap<String, String> empNames = new HashMap<String, String>();

	public void setNames() {
		empNames.put("HCL101", "Harsha");
		empNames.put("HCL102", "Niranjan");
		empNames.put("HCL103", "Jayaram");

	}

	public void printNames() {
		System.out.println("The employee details are :" + empNames);
	}

	public void getName(String key) {
		System.out.println("\n Search an element from the list :");

		if (empNames.containsKey("HCL105")) {
			System.out.println("Element found !\n");
		} else {
			System.out.println("Element not found !!");
		}

	}

	public void printNamesKeySet() {
		System.out.println("Printing the keyset :" + empNames.keySet());
	}

	public void printSize() {
		System.out.println("The size of the student hashmap is :" + empNames.size());

	}

	public void remove(String key) {
		empNames.remove("HCL103", "Jayaram");
		System.out.println("Elements after removing from the employee  are :" + empNames);
	}
}