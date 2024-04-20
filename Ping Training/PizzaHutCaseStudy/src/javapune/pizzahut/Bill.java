package javapune.pizzahut;

import java.util.Date;

public class Bill {
	
	private int billNo;
	private String custName;
	private Date date;
	private int total;
	private String[] items;
	
	
	
	public Bill(int billNo, String custName, Date date, int total, String[] items) {
		super();
		this.billNo = billNo;
		this.custName = custName;
		this.date = date;
		this.total = total;
		this.items = items;
	}
	
	public int getBillNo() {
		return billNo;
	}
	public void setBillNo(int billNo) {
		this.billNo = billNo;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String[] getItems() {
		return items;
	}
	public void setItems(String[] items) {
		this.items = items;
	}
	
	

}
