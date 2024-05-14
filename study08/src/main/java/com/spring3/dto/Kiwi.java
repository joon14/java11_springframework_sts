package com.spring3.dto;

public class Kiwi implements Fruits {
	private int num;

	public Kiwi() { }
	public Kiwi(int num) {
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
		return "kiwi [num=" + num + "]";
	}
}
