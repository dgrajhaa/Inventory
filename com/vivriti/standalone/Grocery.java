package com.vivriti.standalone;

import java.util.Map;

import com.vivriti.data.Item;
import com.vivriti.data.RegisterCounter;
import com.vivriti.data.Store;
import com.vivriti.data.User;
import com.vivriti.data.discount.DiscountFactory;

public class Grocery {
	
	public static void main(String args[]) throws Exception{
		InitializerHelper helper = new InitializerHelper();
		Map<String, Item> itemsInStore = helper.getStoreItems();
		Map<String, User> storeUsers = helper.getStoreUsers();
		Store store = new Store();
		DiscountFactory factory = new DiscountFactory();
		store.initializeDiscountFactory(factory);
		store.initializeStore(itemsInStore);
		store.initializeUser(storeUsers);
		
		RegisterCounter counter = new RegisterCounter(store);
		String contact = "9500426273";
		counter.initSaleBill(contact.trim());
		counter.saleItem("hamamsoap", 3);
		counter.saleItem("lays", 5);
		counter.saleItem("wheat", 2);
		counter.generateSaleBill();
	}

}
