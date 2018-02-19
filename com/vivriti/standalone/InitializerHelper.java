package com.vivriti.standalone;

import java.util.HashMap;
import java.util.Map;

import com.vivriti.data.Item;
import com.vivriti.data.User;

public class InitializerHelper {

	public Map<String, Item> getStoreItems() {
		Map<String, Item> itemsInStore = new HashMap<String, Item>();
		Item i1 = new Item("wheat", "grass", 1, 50, 100, 5);
		Item i2 = new Item("pepsi", "drinks", 1, 45, 100, 12);
		Item i3 = new Item("dal", "grass", 1, 50, 100, 5);
		Item i4 = new Item("wheatfloor", "flour", 1, 60, 100, 5);
		Item i5 = new Item("goodday", "biscuit", 1, 20, 100, 5);
		Item i6 = new Item("lays", "snacks", 1, 10, 100, 5);
		Item i7 = new Item("rice", "grass", 1, 47, 100, 5);
		Item i8 = new Item("harpick", "dailyfreshening", 1, 100, 100, 12);
		Item i9 = new Item("milk", "poultry", 1, 50, 100, 5);
		Item i10 = new Item("cheese", "poultry", 1, 240, 100, 8);
		Item i11 = new Item("hamamsoap", "freshner", 1, 18, 100, 8);
		itemsInStore.put("wheat", i1);
		itemsInStore.put("pepsi", i2);
		itemsInStore.put("dal", i3);
		itemsInStore.put("wheatfloor", i4);
		itemsInStore.put("goodday", i5);
		itemsInStore.put("lays", i6);
		itemsInStore.put("rice", i7);
		itemsInStore.put("harpick", i8);
		itemsInStore.put("milk", i9);
		itemsInStore.put("cheese", i10);
		itemsInStore.put("hamamsoap", i11);
		return itemsInStore;
	}
	public Map<String, User> getStoreUsers() {
		Map<String, User> storeUsers = new HashMap<String, User>();
		User u1 = new User("raja", "customer", "9500426270", "apartments1");
		User u2 = new User("vinay", "employee", "9500426271", "apartments2");
		User u3 = new User("mahi", "employee", "9500426272", "apartments3");
		User u4 = new User("rahul", "customer", "9500426273", "apartments4");
		User u5 = new User("venkat", "customer", "9500426274", "apartments5");
		User u6 = new User("manoj", "customer", "9500426275", "apartments6");
		User u7 = new User("kumar", "customer", "9500426276", "apartments7");
		User u8 = new User("suraj", "customer", "9500426277", "apartments8");
		User u9 = new User("kanish", "employee", "9500426278", "apartments9");
		User u10 = new User("saha", "employee", "9500426279", "apartments10");
		
		storeUsers.put("9500426270", u1);
		storeUsers.put("9500426271", u2);
		storeUsers.put("9500426272", u3);
		storeUsers.put("9500426273", u4);
		storeUsers.put("9500426274", u5);
		storeUsers.put("9500426275", u6);
		storeUsers.put("9500426276", u7);
		storeUsers.put("9500426277", u8);
		storeUsers.put("9500426278", u9);
		storeUsers.put("9500426279", u10);
		return storeUsers;
	}
}
