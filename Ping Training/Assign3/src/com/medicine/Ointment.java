package com.medicine;

class Ointment extends Medicine {
	public Ointment(double price, String expiryDate) {
		super(price, expiryDate);
	}

	@Override
	public void displayLabel() {
		System.out.println("Ointment - For external use only");
	}
}
