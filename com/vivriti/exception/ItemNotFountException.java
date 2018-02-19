package com.vivriti.exception;

public class ItemNotFountException extends Exception {

	public String message = "Item not found";
	
	public ItemNotFountException(String msg) {
		this.message = msg;
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return this.message;
	}
}
