package com.assignment;

public class Customer {
	private String custNo;
	private String custName;
	private String category;

	public String getCustNo() {
		return custNo;
	}

	public String getCustName() {
		return custName;
	}

	public String getCategory() {
		return category;
	}

	public Customer(String custNo, String custName, String category) {
		this.custNo = custNo;
		this.custName = custName;
		this.category = category;

		if (!custNo.startsWith("c") && !custNo.startsWith("C")) {
			throw new InvalidInputException("custNo must start with ‘C’ or ‘c’");

		}
		if (custName.length() < 4) {
			throw new InvalidInputException("custName must be atleast of 4 characters");
		}

		if (!category.equalsIgnoreCase("Platinum") && !category.equalsIgnoreCase("Gold")
				&& !category.equalsIgnoreCase("Silver")) {
			throw new InvalidInputException("category must be either ‘Platinum’, ‘Gold’ or ‘Silver ‘");
		}

	}

	@Override
	public String toString() {
		return "Customer [custNo=" + custNo + ", custName=" + custName + ", category=" + category + "]";
	}

}
