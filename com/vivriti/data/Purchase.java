package com.vivriti.data;

public class Purchase {

	private String itemName;
	private double noOfUnitPurchased;
	private double amount;
	private  double tax;
	
	
	public Purchase(String itemName, double noOfUnitPurchased, double amount, double tax) {
		super();
		this.itemName = itemName;
		this.noOfUnitPurchased = noOfUnitPurchased;
		this.amount = amount;
		this.tax = tax;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getNoOfUnitPurchased() {
		return noOfUnitPurchased;
	}
	public void setNoOfUnitPurchased(double noOfUnitPurchased) {
		this.noOfUnitPurchased = noOfUnitPurchased;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
}
