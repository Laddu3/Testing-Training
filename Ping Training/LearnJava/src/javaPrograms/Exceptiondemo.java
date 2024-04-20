package javaPrograms;

public class Exceptiondemo {
	
	public static void main(String[] args) {
		
		try {
			
		
		int a = 0;
		int b= 25/a;
		
		System.out.println("Exception thrown");
	}
		catch(ArithmeticException e) {
			
			System.out.println("You can not divide an integer by Zero");
			}
		System.out.println("After Catch block");
		}
	}

