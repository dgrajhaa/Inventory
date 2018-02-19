package com.vivriti.data;

public class Sale {

	private String itemName;
	private double noOfUnitRequired;
	private double actualPrice;
	private double discount;
	private double finalPrice;
	private double tax;
	
	
	public Sale(String itemName, double noOfUnitRequired, double actualPrice, double finalPrice, double discount, double tax) {
		super();
		this.itemName = itemName;
		this.noOfUnitRequired = noOfUnitRequired;
		this.actualPrice = actualPrice;
		this.finalPrice = finalPrice;
		this.discount = discount;
		this.tax = tax;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getNoOfUnitRequired() {
		return noOfUnitRequired;
	}
	public void setNoOfUnitRequired(double noOfUnitRequired) {
		this.noOfUnitRequired = noOfUnitRequired;
	}
	public double getActualPrice() {
		return actualPrice;
	}
	public void setActualPrice(double actualPrice) {
		this.actualPrice = actualPrice;
	}
	public double getFinalPrice() {
		return finalPrice;
	}
	public void setFinalPrice(double finalPrice) {
		this.finalPrice = finalPrice;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	@Override
	public String toString() {
		String str = this.itemName + " 1 * "+ this.noOfUnitRequired + " " + this.actualPrice + " - " + this.discount + " + " + this.tax + " " + this.finalPrice;
		return str;
	}
	
}
