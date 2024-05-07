package com.spring3.dto;

public class Store {
	private int storeNum;
	private String StoreName;
	
	public Store() { }
	public Store(int storeNum, String storeName) {
		super();
		this.storeNum = storeNum;
		StoreName = storeName;
	}
	
	public int getStoreNum() {
		return storeNum;
	}
	public void setStoreNum(int storeNum) {
		this.storeNum = storeNum;
	}
	public String getStoreName() {
		return StoreName;
	}
	public void setStoreName(String storeName) {
		StoreName = storeName;
	}
	
	@Override
	public String toString() {
		return "Store [storeNum=" + storeNum + ", StoreName=" + StoreName + "]";
	}
}
