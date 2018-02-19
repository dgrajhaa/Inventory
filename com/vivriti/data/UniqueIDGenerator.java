package com.vivriti.data;

public class UniqueIDGenerator {

	private int cnt;
	
	public UniqueIDGenerator() {
		this.cnt = -1;
	}
	
	public int getNextID() {
		this.cnt++;
		return this.cnt;
	}
}
