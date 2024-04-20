package com.medicine;

import java.util.Random;

public class TestMedicine {
	public static void main(String[] args) {
		Random rand = new Random();
		Medicine[] medicines = new Medicine[5];
		for (int i = 0; i < 5; i++) {
			int choice = rand.nextInt(3) + 1; // Generate random number between 1 and 3
			double price = rand.nextDouble() * 100; // Random price between 0 and 100
			String expiryDate = "2024-12-31"; // Example expiry date
			switch (choice) {
			case 1:
				medicines[i] = new Tablet(price, expiryDate);
				break;
			case 2:
				medicines[i] = new Syrup(price, expiryDate);
				break;
			case 3:
				medicines[i] = new Ointment(price, expiryDate);
				break;
			}
		}
		for (Medicine medicine : medicines) {
			medicine.getDetails();
			medicine.displayLabel();
			System.out.println("-------------------------");
		}
	}
}