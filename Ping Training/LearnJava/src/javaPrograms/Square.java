package javaPrograms;
import java.util.Scanner;
public class Square
{
   public static void main(String args[]) 
    {   

        
         System.out.println("Enter the side of the square:");
         
         Scanner s= new Scanner(System.in);
         
	 double a= s.nextDouble();
	 
         double  perimeter=4*a;
     
	 System.out.println("perimeter of Square is: " + perimeter);      
   }
}