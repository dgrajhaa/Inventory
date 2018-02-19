package com.vivriti.data;

import java.util.HashMap;
import java.util.Map;

import com.vivriti.data.discount.DiscountFactory;

public abstract class AbstractStore{

	Map<String, Item> itemsInStore = new HashMap<String, Item>();
	Map<String, User> storeUsers = new HashMap<String, User>();
	Map<Integer, Bill> bills = new HashMap<Integer, Bill>();
	DiscountFactory factory = new DiscountFactory();

//	initialize inline from memory or fetch record from database
	public void initializeDiscountFactory(DiscountFactory factory) {
		this.factory = factory;
	}	
	public void initializeStore(Map<String, Item> itemsInStore) {
		this.itemsInStore = itemsInStore;
	}
	public void initializeUser(Map<String, User> storeUsers) {
		this.storeUsers = storeUsers;
	}
	
	public abstract void purchaseNewItem(int billId, String item, String category, double unitQuantity, double unitPrice, double availableQuantity, double taxPercentage);	
	public abstract void purchaseItem(int billId, String item, double quantity);
	public abstract void saleItem(int billId, String item, double quantity);
	public abstract void addUser(String name, String role, String contact, String address);
}
