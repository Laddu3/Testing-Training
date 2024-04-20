package java.multithreading;

public class CookThread extends Thread{

	private String name;
	private Pizza pizza;
	
	
	
	public CookThread(String name, Pizza pizza) {
		super();
		this.name = name;
		this.pizza = pizza;
	}



	public void run() {
		synchronized (pizza) {
			System.out.println("CookThread "+name+" is preparing "+pizza);
			try {
				Thread.sleep((long)(pizza.timeForPreparation*1000)); //converting seconds to milliseconds
			}catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			System.out.println("CookThread "+name+" finished preparing "+pizza);
			pizza.notify();
		}
	}
}
