package javaPrograms;

import java.util.Scanner;

public class Operations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first number:");
		double num1 = sc.nextDouble();

		System.out.println("Enter the second number:");
		double num2 = sc.nextDouble();

		System.out.println("Select operation: (+, -, *, /)");
		char operator = sc.next().charAt(0);

		double result;

		switch (operator) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			if (num2 != 0)
				result = num1 / num2;
			else {
				System.out.println("Error: Cannot divide by zero");
				return;
			}
			break;
		default:
			System.out.println("Error: Invalid operator");
			return;
		}

		System.out.println("Result: " + result);
	}
}
