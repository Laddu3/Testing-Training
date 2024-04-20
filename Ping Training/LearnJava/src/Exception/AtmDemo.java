package Exception;

public class AtmDemo {
	
	public static void main(String[] args) {
		BalanceCheck bc = new BalanceCheck(121);
		System.out.println("Deposit Rs1000");
		bc.deposit(1000);
		try {
			System.out.println("Withdraw Rs500");
			bc.withdraw(500);
			System.out.println("Withdraw rs600");
			bc.withdraw(600);
		}
		catch(LowBalanceException e) {
			System.out.println("Sorry! Insufficient balance"+ e.getamount());
		}
	}

}
