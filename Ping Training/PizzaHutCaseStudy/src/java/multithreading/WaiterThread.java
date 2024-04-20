package java.multithreading;

public class WaiterThread extends Thread{

	private String name;
	private Pizza pizza;
	
	
	
	public WaiterThread(String name, Pizza pizza) {
		this.name = name;
		this.pizza = pizza;
	}



	public void run() {
		synchronized (pizza) {
			try {
				System.out.println("WaiterThread "+name+" is waiting for "+pizza);
				pizza.wait();
			}catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			System.out.println("WaiterThread "+name+" served "+pizza);
		}
	}
}
