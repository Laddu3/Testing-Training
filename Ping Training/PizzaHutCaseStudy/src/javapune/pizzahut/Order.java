package javapune.pizzahut;

import java.util.Date;
import java.util.zip.CheckedOutputStream;

public class Order implements Deliverable
{
	private int orderNo;
	private Date orderDate;
	private int cost;
	private String custName;
	private String custAddress;
	private int approxDistance;
	
	
	
	public Order(int orderNo, Date orderDate, int cost, String custName, String custAddress, int approxDistance) {
		super();
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		this.cost = cost;
		this.custName = custName;
		this.custAddress = custAddress;
		this.approxDistance = approxDistance;
	}



	@Override
	public boolean delivery() {
		if(approxDistance <= deliveryAreaLimit) {
			return true;
		}else {
			System.out.println("Home Delivery not available for this distance");
			return false;
		}
		
	}
	
}
