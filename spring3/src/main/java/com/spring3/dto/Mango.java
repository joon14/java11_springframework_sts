package com.spring3.dto;

public class Mango implements Fruits {
	private int price;
	
	public Mango() { }
	public Mango(int price) {
		super();
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Mango [price=" + price + "]";
	}
}
