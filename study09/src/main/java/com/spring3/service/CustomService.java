package com.spring3.service;

import java.util.List;

import com.spring3.dto.Custom;

public interface CustomService {
	public List<Custom> getCustomList();
	public Custom getCustom(String id);
	public int maxNum();
	public void insCustom(Custom custom);
	public void changePw(Custom custom);
	public void changeInfo(Custom custom);
	public void delCustom(String id);
}
