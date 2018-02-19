package com.vivriti.exception;

public class ItemOutOfStockException extends Exception{

	public String message = "out of stock";
	
	public ItemOutOfStockException(String msg) {
		this.message = msg;
	}
	
	@Override
	public String getMessage() {
		return this.message;
	}
}
