package com.vivriti.data;

import com.vivriti.data.discount.Discount;
import com.vivriti.data.discount.DiscountFactory;

public class Store extends AbstractStore{

	UniqueIDGenerator userID = new UniqueIDGenerator();

	public void purchaseNewItem(int billId, String item, String category, double unitQuantity, double unitPrice, double availableQuantity, double taxPercentage) {
		Bill currentBill = this.bills.get(billId);
		Item i = new Item(item, category, unitQuantity, unitPrice, availableQuantity, taxPercentage);
		this.itemsInStore.put(item, i);
		Purchase p = new Purchase(item, unitQuantity, unitPrice, taxPercentage);
		currentBill.purchase(p);
	}
	
	public void purchaseItem(int billId, String item, double quantity) {
		Bill currentBill = this.bills.get(billId);
		Item i = this.itemsInStore.get(item);
		i.purchase(quantity);
		Purchase p = new Purchase(item, i.getUnitQuantity(), quantity, i.getTaxPercentage());
		currentBill.purchase(p);
	}
	
	public void saleItem(int billId, String item, double noOfUnitRequired) {
		Bill currentBill = this.bills.get(billId);
		Item i = this.itemsInStore.get(item);	
		if(i != null){
				double available = i.getAvailableQuantity(); 
				if(available > noOfUnitRequired) 
				{
					Discount itemDiscount = this.factory.getDiscount(i.getItemName());
					Discount categoryDiscount = this.factory.getDiscount(i.getCategory());
					double actualPrice = i.getUnitPrice() * noOfUnitRequired;
					double d1 = 0; 
					double d2 = 0;
					if(itemDiscount != null) 
						d1 = itemDiscount.calculateDiscount(actualPrice);
					if(categoryDiscount != null) 
						d2 = categoryDiscount.calculateDiscount(actualPrice);
					double discount = (d1 + d2) * noOfUnitRequired;
					double finalPrice = actualPrice - discount;
					double tax = (finalPrice) * (i.getTaxPercentage()/100);
		//			System.out.println("stock before purchase");
		//			System.out.println(i.toString());
					i.sale(noOfUnitRequired);
		//			System.out.println("stock after purchase");
		//			System.out.println(i.toString());
					Sale s = new Sale(item, noOfUnitRequired, actualPrice, finalPrice, discount, tax);
					currentBill.addSale(s);
				}
				else {
					System.out.println("not enough quantity available");
				}
		}
		else {
				System.out.println("Item not in store");
		}
	}
	public void addUser(String name, String role, String contact, String address) {
		User user = new User(name, role, contact, address);
		this.storeUsers.put(contact, user);
	}
	
	public DiscountFactory getFactory() {
		return this.factory;
	}
	public User getUser(String id) {
		return this.storeUsers.get(id);
	}
	public void saveBill(int id, Bill bill) {
		this.bills.put(id, bill);
	}
	public Bill getBill(int id) {
		return this.bills.get(id);
	}
	
	public void generateBill(int billId) {
		Bill currentBill = this.bills.get(billId);
		currentBill.generateBill();
	}


}
