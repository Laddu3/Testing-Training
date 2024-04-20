package com.arraylist;

public class ArrayListDemo {
	public static void main(String[] args) {
		Student student = new Student();
		student.setNames();
		student.searchName(1);
		student.searchName("Harsha");
		student.printNames();
		student.removeName("Jayaram");
		student.printNames();
	}

}
