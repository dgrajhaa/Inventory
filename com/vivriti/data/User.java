package com.vivriti.data;

public class User {

	private String userName;
	private String userType;
	private String contact;
	private String address;
	
	public User(String userName, String userType, String contact, String address) {
		super();
		this.userName = userName;
		this.userType = userType;
		this.contact = contact;
		this.address = address;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
