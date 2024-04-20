package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Student {
	private ArrayList<String> names = new ArrayList<>();

	public Student() {
		
	}

	public void setNames() {

		System.out.println("Enter names of students");
		while (true) {

			Scanner scanner = new Scanner(System.in);
			String name = scanner.nextLine();
			if (name.equalsIgnoreCase("done")) {
				break;
			}
			names.add(name);
		}
	}

	public void searchName(String name) {
		if (names.contains(name)) {
			System.out.println(name + " is present in the list.");
		} else {
			System.out.println(name + " is not present in the list.");
		}
	}

	public void searchName(int index) {
		if (index >= 0 && index < names.size()) {
			System.out.println("Name at index " + index + ": " + names.get(index));
		} else {
			System.out.println("Invalid index.");
		}
	}

	public void printNames() {
		Iterator<String> iterator = names.iterator();
		System.out.println("Names of students:");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	public void removeName(String stuName) {
		if (names.remove(stuName)) {
			System.out.println(stuName + " removed from the list.");
		} else {
			System.out.println(stuName + " is not present in the list.");
		}
	}
}
