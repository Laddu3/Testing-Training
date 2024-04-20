
package javaPrograms;
import java.util.ArrayList;
public class Elementsearch {	 	  
	      public static void main(String[] args) {
		          ArrayList<Integer> list = new ArrayList<>();
		          list.add(1);
		          list.add(2);
		          list.add(3);
		   
		          int elementToSearch = 10;
		   
		          if (list.contains(elementToSearch)) {
		              System.out.println("Element found in the list.");
		          } else {
		              System.out.println("Element not found in the list.");
		          }
		      }
		  }
