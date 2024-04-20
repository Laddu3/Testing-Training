package com.hashmap;

public class TestHashMap {

	public static void main(String[] args) {
		Student student = new Student();
		student.setNames();
		student.printNames();
		student.getName("HCL105");
		student.printNamesKeySet();
		student.printSize();
		student.remove("HCL103");
	}

}
