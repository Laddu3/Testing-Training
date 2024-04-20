package javapune.pizzahut;

public class BillReports {

	private Bill[] bills;
	
	public BillReports(int size) {
		bills = new Bill[size];
	}
	
	public void addBill(Bill bill) {
		for(int i=0;i<bills.length;i++) {
			if(bills[i]==null) {
				bills[i]= bill;
				break;
			}
		}
	}
	
	public boolean updateBill(int billNo, int newTotal) {
		for(Bill bill : bills) {
			if(bill != null && bill.getBillNo() == billNo) {
				bill.setTotal(newTotal);
				return true;
			}
		}
		return false;
	}
	
	
	public Bill[] getBills() {
		return bills;
	}
	
	
	public Bill searchBill(int billNo) throws BillNotFoundException {
		for(Bill bill : bills) {
			if(bill != null && bill.getBillNo() == billNo) {
				return bill;
			}
		}
		throw new BillNotFoundException("Bill with bill number "+billNo+ " not found");
	}
}
