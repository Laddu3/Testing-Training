package inherit;

public class ClassA {
	public static void openbrowser() {
		System.out.println("Your Browser is Open");
	}
	public void login() {
		System.out.println("Logged in ");
	}
	
	public static  void main(String[] args) {
		
	ClassA obj = new ClassA();
		openbrowser();
	}
}
