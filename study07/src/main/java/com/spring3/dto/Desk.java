package com.spring3.dto;

public class Desk implements Goods {
	private double size;
	
	public Desk() { }
	public Desk(double size) {
		super();
		this.size = size;
	}
	
	@Override
	public String toString() {
		return "Desk [size=" + size + "]";
	}
}
