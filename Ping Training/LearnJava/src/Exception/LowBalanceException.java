package Exception;

public class LowBalanceException extends Exception {
	
	private double amount;
	
public LowBalanceException(double amount) {
	this.amount=amount;
}
public double getamount()
{
	return amount;
}
}
