package com.test;

import java.util.Scanner;

public class Leap implements Main {

	public void leapYear() {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Year:");
		int a = s.nextInt();

		boolean isLeapYear;

		isLeapYear = (a % 4 == 0);
		if (isLeapYear) {
			System.out.println(a + " is a leap year.");
		} else {
			System.out.println(a + " is not a leap year.");
		}
	}

}
