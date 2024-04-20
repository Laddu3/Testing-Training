package com.medicine;

public abstract class Medicine {
	
	   protected double price;
	   protected String expiryDate;
	   public Medicine(double price, String expiryDate) {
	       this.price = price;
	       this.expiryDate = expiryDate;
	   }
	   public abstract void displayLabel();
	   public void getDetails() {
	       System.out.println("Price: " + price);
	       System.out.println("Expiry Date: " + expiryDate);
	   }
	}
