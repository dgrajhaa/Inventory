package com.vivriti.data;

public class Item {

	private String itemName;
	private String category;
	private double unitQuantity; // noOfUnit
	private double unitPrice;
	private double availableQuantity;
	private double taxPercentage;
	
	
	public Item(String itemName, String category, double unitQuantity, double unitPrice, double availableQuantity,
			double taxPercentage) {
		super();
		this.itemName = itemName;
		this.category = category;
		this.unitQuantity = unitQuantity;
		this.unitPrice = unitPrice;
		this.availableQuantity = availableQuantity;
		this.taxPercentage = taxPercentage;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getUnitQuantity() {
		return unitQuantity;
	}

	public void setUnitQuantity(double unitQuantity) {
		this.unitQuantity = unitQuantity;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getAvailableQuantity() {
		return availableQuantity;
	}

	public void setAvailableQuantity(double availableQuantity) {
		this.availableQuantity = availableQuantity;
	}

	public double getTaxPercentage() {
		return taxPercentage;
	}

	public void setTaxPercentage(double taxPercentage) {
		this.taxPercentage = taxPercentage;
	}

	public void sale(double quantity) {
		this.availableQuantity -= quantity;
	}
	
	public void purchase(double quantity) {
		this.availableQuantity += quantity;
	}
	
	@Override
	public String toString() {
		String str = this.itemName + " "+ this.category + " " + this.unitQuantity + " " + this.unitPrice + " " + this.availableQuantity + " " + this.taxPercentage;
		return str;
	}
	
}
