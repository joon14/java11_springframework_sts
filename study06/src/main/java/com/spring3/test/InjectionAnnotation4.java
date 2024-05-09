package com.spring3.test;

public class InjectionAnnotation4 {
	private int data1;
	private String date2;
	
	public InjectionAnnotation4() { }
	public InjectionAnnotation4(int data1, String date2) {
		super();
		this.data1 = data1;
		this.date2 = date2;
	}
	
	public int getData1() {
		return data1;
	}
	public void setData1(int data1) {
		this.data1 = data1;
	}
	public String getDate2() {
		return date2;
	}
	public void setDate2(String date2) {
		this.date2 = date2;
	}
}
