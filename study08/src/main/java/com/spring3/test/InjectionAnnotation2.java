package com.spring3.test;

import com.spring3.dto.Shop;

public class InjectionAnnotation2 {
	private Shop shopBean1;
	
	public Shop getShopBean1() {
		return shopBean1;
	}
	public void setShopBean1(Shop shopBean1) {
		this.shopBean1 = shopBean1;
	}
}
