package javaPrograms;

import java.util.Scanner;

public class Areaofcircle {
	
	  public static void main(String args[])
	  {
		  Scanner s = new Scanner(System.in);
		  System.out.println("Enter the Radius:");
		  
		  int radius = s.nextInt();
	  

	    double area = Math.PI * (radius * radius);
	    System.out.printf("Area is: %.2f", area);

	    double circumference= Math.PI * 2*radius;
	    System.out.printf( "\nCircumference is: %.2f",circumference) ;
	  }
	}

