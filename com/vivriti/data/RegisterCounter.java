package com.vivriti.data;

import com.vivriti.data.discount.Discount;

public class RegisterCounter {

	Store myStore;
	UniqueIDGenerator billID = new UniqueIDGenerator();
	int currentBillId = 0;
	
	public RegisterCounter(Store myStore) {
		this.myStore = myStore;
	}
	
	public void initSaleBill(String contact) {
		Bill saleBill = new Bill();
		this.currentBillId = billID.getNextID();
		this.myStore.saveBill(this.currentBillId, saleBill);
		updateUserLevelDiscount(contact);
	}

	public void updateUserLevelDiscount(String contact) {
		Bill saleBill = this.myStore.getBill(this.currentBillId);
		User user = this.myStore.getUser(contact);
		if(user != null) {
			String userType = user.getUserType();
			Discount discount = this.myStore.getFactory().getDiscount(userType);
			saleBill.setDiscount(discount);
		}
	}
	public void initPurchaseBill() {
		Bill purchaseBill = new Bill();
		this.currentBillId = billID.getNextID();
		this.myStore.saveBill(this.currentBillId, purchaseBill);
	}
	
	public void saleItem(String item, double quantity) {
		this.myStore.saleItem(this.currentBillId, item, quantity);
	}
	
	public void purchaseItem(String item, double quantity) {
		this.myStore.purchaseItem(this.currentBillId, item, quantity);
	}
	
	public void purchaseNewItem(String item,String category,double unitQuantity,double unitPrice,double availableQuantity,double taxPercentage) {
		this.myStore.purchaseNewItem(this.currentBillId, item, category, unitQuantity, unitPrice, availableQuantity, taxPercentage);
	}
	public void generateSaleBill() {
		this.myStore.generateBill(this.currentBillId);
	}
	public void generatePurchaseBill() {
		this.myStore.generateBill(this.currentBillId);
	}
}
