package com.vivriti.exception;

public class RegisterNotFoundException extends Exception {

	public String message = "Item not found";
	
	public RegisterNotFoundException(String msg) {
		this.message = msg;
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return this.message;
	}
}
