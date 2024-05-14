package com.spring3.vo;

import java.util.ArrayList;

import com.spring3.dto.Store;

public class Maker {
	private String part;
	private Integer partNum;
	private ArrayList<Store> stores;
	
	public Maker() { }
	public Maker(String part, Integer partNum, ArrayList<Store> stores) {
		super();
		this.part = part;
		this.partNum = partNum;
		this.stores = stores;
	}
	
	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
	}
	public Integer getPartNum() {
		return partNum;
	}
	public void setPartNum(Integer partNum) {
		this.partNum = partNum;
	}
	public ArrayList<Store> getStores() {
		return stores;
	}
	public void setStores(ArrayList<Store> stores) {
		this.stores = stores;
	}
	
	@Override
	public String toString() {
		return "Maker [part=" + part + ", partNum=" + partNum + ", stores=" + stores + "]";
	}
}
