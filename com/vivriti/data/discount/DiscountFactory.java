package com.vivriti.data.discount;

public class DiscountFactory {
	
	public Discount getDiscount(String key) {
		if("customer".equals(key)) 
			return new CustomerDiscount(5, 0);
		if("employee".equals(key)) 
			return new EmployeeDiscount(10, 0);
		if("drinks".equals(key))
			return new ChipsCategoryDiscount(2, 0);
		if("hamamsoap".equals(key))
			return new HamamSoapDiscount(0, 1);
		return null;
	}
}
