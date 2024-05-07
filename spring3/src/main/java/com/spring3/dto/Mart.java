package com.spring3.dto;

import java.util.Set;

public class Mart {
	private String MartName;
	private Set<Fruits> frSet;
	
	public Mart() { }
	public Mart(String martName, Set<Fruits> frSet) {
		super();
		MartName = martName;
		this.frSet = frSet;
	}
	
	public String getMartName() {
		return MartName;
	}
	public void setMartName(String martName) {
		MartName = martName;
	}
	public Set<Fruits> getFrSet() {
		return frSet;
	}
	public void setFrSet(Set<Fruits> frSet) {
		this.frSet = frSet;
	}
	
	@Override
	public String toString() {
		return "Mart [MartName=" + MartName + ", frSet=" + frSet + "]";
	}
}
