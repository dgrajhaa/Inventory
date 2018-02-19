package com.vivriti.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.vivriti.data.discount.Discount;

public class Bill {
	List<Sale> saleCart;
	List<Purchase> purchase;
	Discount discount;
	double billAmount;
	double discountAmount;
	double tax;
	String status;
	
	public Bill() {
		this.billAmount = 0;
		this.tax = 0;
		this.discountAmount = 0;
		this.saleCart = new ArrayList<Sale>();
		this.purchase = new ArrayList<Purchase>();
	}

	public Discount getDiscount() {
		return discount;
	}

	public void setDiscount(Discount discount) {
		this.discount = discount;
	}
	
	public void addSale(Sale saleBill) {
		this.saleCart.add(saleBill);
	}
	
	public void purchase(Purchase purchaseBill) {
		
	}
	
	public void generateBill() {
		Iterator<Sale> iter = this.saleCart.iterator();
		this.billAmount = 0;
		this.tax = 0;
		this.discountAmount = 0;
		System.out.println("Item Unit Quantity ActualPrice Discount Tax FinalPrice");
		while(iter.hasNext()) {
			Sale s = iter.next();
			this.billAmount += s.getFinalPrice();
			this.tax += s.getTax();
			System.out.println(s.toString());
		}
		if(discount != null)
			this.discountAmount = this.discount.calculateDiscount(this.billAmount); 
		System.out.println("Bill Details ");
		System.out.println("=============");
		System.out.println("total bill : " + this.billAmount);
		System.out.println("user discount : " + this.discountAmount);
		System.out.println("tax : "+ this.tax);
		double amount = this.billAmount - this.discountAmount + this.tax;
		System.out.println("amount to be pay : "+ amount);
	}
	
}
