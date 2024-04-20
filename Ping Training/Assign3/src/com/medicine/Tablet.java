package com.medicine;

class Tablet extends Medicine {
	public Tablet(double price, String expiryDate) {
		super(price, expiryDate);
	}

	@Override
	public void displayLabel() {
		System.out.println("Tablets - Store in a cool dry place");
	}
}
