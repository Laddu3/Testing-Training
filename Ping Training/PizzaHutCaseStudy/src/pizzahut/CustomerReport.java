package pizzahut;

public class CustomerReport {

	Customer[] custList;

	static int curr_index = 0;

	public CustomerReport() {
		this(5);
	}

	public CustomerReport(int n) {
		custList = new Customer[n];
	}

	public void addCustomer(Customer c) {
		if (curr_index < custList.length) {
			custList[curr_index++] = c;
		} else {
			System.out.println("The array is full!");
		}
	}

	public void printList() {
		for (Customer c : custList) {
			if (c == null) {
				break;
			}
			System.out.println(
					"Number: " + c.getCustNo() + "\nName: " + c.getCustName() + "\nAddress: " + c.getCustAddr());
			System.out.println("\n\n");
		}
	}
}
