package javaPrograms;
import java.util.ArrayList;
import java.util.Iterator;
 class Employee {
	 
	 int emp_id;
	 String name;
}
  class ArrayListDemo{
	 
	 public static void main(String[] args) {
		 ArrayList<Object> list1 =new ArrayList<Object>();
		 
		 ArrayList<String> list2 =new ArrayList<String>();
		 
		 Employee e = new Employee();
		 e.emp_id=101;
		 e.name="Harsha";
		 
		 list1.add(2);
		 list1.add(4);
		 list1.add("Harsha");
		 list1.add(e);
		 list1.add('a');
		 
		 
		 list2.add("Pavan");
		 list2.add("Ramesh");
		 list2.add("Jayaram");
		 list2.add("Niranjan");
		 
		 System.out.println("List 1:"+list1);
		 System.out.println("List 2:"+list2);
		 
		 
		 Object o = list2.get(2);
		 
		 System.out.println("Get an element from List 1 that is at index 2\n"+o);
		 
		 String s =list2.get(2);
		 
		 System.out.println("Get an element from List 2 that is at index 2\n"+s);
		 
		 
		 list2.set(2, "Harshith");
		 System.out.println("Update an element from list 2 that is at index 2\n");
		 System.out.println("List 2 after Updation");
		 System.out.println(list2);
		 
		 
		 list2.remove(2);
		 System.out.println("Remove an element from List 2 that is at Index 2\n");
		 System.out.println("List 2 after Updation");
		 System.out.println(list2);
		 
		 
		 System.out.println("Search an element from the list");
		 
		 if(list2.contains("Bob")) {
			 System.out.println("Bob is in the list");
		 }
		 
		 System.out.println("*******************************");
		 
		 System.out.println("Iterating with basic for loop");
		 
		 for(int i=0; i<list2.size();i++) {
			 System.out.println(list2.get(i));
		 }
		 
		 System.out.println("Iterating with Iterator");
		 
		 Iterator<String> itr =list2.iterator();
		 
		 System.out.println(itr.next());
		 System.out.println(itr.next());
		 
		 System.out.println("Iterating with Iterator using while loop");
		 
		 while(itr.hasNext()) {
			 String str=itr.next();
			 System.out.println(str);
			 if(str.equals("Jack")) {
				 itr.remove();
			 }
			 System.out.println("Remove jack from List 2");
			 System.out.println("List 2 as follows"+ list2);
		 }
		 
	 }
	 
 }