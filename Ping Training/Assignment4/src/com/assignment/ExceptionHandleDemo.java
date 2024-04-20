package com.assignment;

import java.util.Scanner;

public class ExceptionHandleDemo {
	public static int findReminder(int num1,int num2)
	{
		return num1%num2;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		try {
			int rem=findReminder(num1, num2);
			System.out.println("Reminder is "+rem);
			
		} catch (ArithmeticException e) {
			System.err.println("number2 must not be zero");
		}
		finally
		{
			System.out.println("finally block");
		}
	}

}
