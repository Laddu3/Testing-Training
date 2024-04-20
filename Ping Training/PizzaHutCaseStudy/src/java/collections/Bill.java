package java.collections;

import java.multithreading.Pizza;
import java.util.Date;
import java.util.Vector;

import javax.lang.model.element.NestingKind;

public class Bill {

	private int billNo;
	private String custName;
	private Date date;
	private int total;
	private Vector<Pizza> pizza;
	
	
	
	
	public Bill() {
		super();
	}


	public Bill(int billNo, String custName, Date date) {
		super();
		this.billNo = billNo;
		this.custName = custName;
		this.date = date;
		this.total = 0;
		this.pizza =  new Vector<Pizza>();
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


	public Vector<Pizza> getPizza() {
		return pizza;
	}


	public void setPizza(Vector<Pizza> pizza) {
		this.pizza = pizza;
	}
	
	public void addPizza(Pizza piz) {
		pizza.add(piz);
		total += piz.calculateCost();
	}


	@Override
	public String toString() {
		return "Bill [billNo=" + billNo + ", custName=" + custName + ", date=" + date + ", total=" + total + ", pizza="
				+ pizza + "]";
	}
	
	
}
