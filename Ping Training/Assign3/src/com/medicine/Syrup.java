package com.medicine;

class Syrup extends Medicine {
	public Syrup(double price, String expiryDate) {
		super(price, expiryDate);
	}

	@Override
	public void displayLabel() {
		System.out.println("Syrup - Shake well before use");
	}
}
