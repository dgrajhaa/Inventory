package com.vivriti.data.discount;

public abstract class Discount {

	private double discountPercentage;
	private double flatDiscount;
	
	public Discount(double discountPercentage, double flatDiscount) {
		this.discountPercentage = discountPercentage;
		this.flatDiscount = flatDiscount;
	}

	public double calculateDiscount(double price) {
		double discount = 0;
		if(discountPercentage != 0)
			discount = price * (discountPercentage/100);
		if(flatDiscount != 0) 
			discount += flatDiscount;
		return discount;
	}
}
