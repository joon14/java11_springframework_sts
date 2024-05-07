package com.spring3.dto;

public class Cherry implements Fruits {
	private int num;
	
	public Cherry() { }
	public Cherry(int num) {
		super();
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	@Override
	public String toString() {
		return "Cherry [num=" + num + "]";
	}
}
