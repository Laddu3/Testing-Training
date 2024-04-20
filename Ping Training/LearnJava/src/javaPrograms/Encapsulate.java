package javaPrograms;

public class Encapsulate {

	private String Name;
	private int Roll;
	private int Age;
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getRoll() {
		return Roll;
	}

	public void setRoll(int roll) {
		Roll = roll;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public static void main(String[] args) {
		Encapsulate obj = new Encapsulate();
		 
		obj.setName("Harsha");
		obj.setRoll(20);
		obj.setAge(23);
		
		
		System.out.println("Name:" + obj.getName());
		System.out.println("Roll:" + obj.getRoll());
		System.out.println("Age:" + obj.getAge());
		
		
	}
}
