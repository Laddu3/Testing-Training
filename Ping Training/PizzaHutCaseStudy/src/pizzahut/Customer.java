package pizzahut;

public class Customer {
	
	private int custNo;
	private String custName;
	private String custAddr;
	
	/*
	 * protected void init() { custNo=001; custName="Harsha"; custAddr="Proddatur"; }
	 */
	
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

	public void display() {
		 System.out.println("CustNo:"+ custNo+"CustName:"+custName+"CustAddr"+custAddr);
		
	}

}
