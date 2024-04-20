package javaPrograms;

public class TryCatchDemo {
	
	public static void main(String[] args) {
		
		try {
			String names[]= {"Harsha","Pavan","Ramesh"};
			System.out.println("Access the fourth element" +names[4]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception thrown:"+e);
		}
	}

}
