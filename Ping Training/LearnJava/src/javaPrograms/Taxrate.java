package javaPrograms;

import java.util.Scanner;

public class Taxrate {
 public static void main(String[] args) {

	 Scanner s = new Scanner(System.in);
	  System.out.println("Enter the Income:");
	  
	            double income = s.nextDouble();
		        double taxRate = 0.15;   
		        
		        double tax = income * taxRate;
		        
		        System.out.println("Tax amount: Rs" +  tax);
		    }
		}
