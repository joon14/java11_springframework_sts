package com.spring3.service;

import java.util.List;

import com.spring3.dto.Store;

public interface StoreService {
	public List<Store> getStoreList();
	public Store getStore(int storeNum);
	public int maxNum();
	public void insStore(Store store);
	public void upStore(Store store);
	public void delStore(Store store);
}
