package inherit;

public class ClassB extends ClassA{
   public void homeloans() {
	   System.out.println("You got home loan");
   }
   public void logout() {
	   System.out.println("Loged out from system");
   }
   
   public static void main(String[] args) {
	   ClassB obj=new ClassB();
	   
	   obj.login();
	   openbrowser();
	   obj.homeloans();
	   obj.logout();
   }
}
