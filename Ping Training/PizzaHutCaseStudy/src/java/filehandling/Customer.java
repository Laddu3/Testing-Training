package java.filehandling;

import java.io.Serializable;

public class Customer implements Serializable{

	private int custNo;
	private String custName;
	private String custAddr;
	
	
	
	public Customer(int custNo, String custName, String custAddr) {
		super();
		this.custNo = custNo;
		this.custName = custName;
		this.custAddr = custAddr;
	}
	public int getCustNo() {
		return custNo;
	}
	public void setCustNo(int custNo) {
		this.custNo = custNo;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustAddr() {
		return custAddr;
	}
	public void setCustAddr(String custAddr) {
		this.custAddr = custAddr;
	}
	
	@Override
	public String toString() {
		return custNo +"\t\t"+custName+"\t\t"+custAddr;
	}
}
