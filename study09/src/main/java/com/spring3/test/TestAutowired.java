package com.spring3.test;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring3.dao.SampleDAO;
import com.spring3.dao.SampleDAOImpl;

public class TestAutowired {

	@Autowired
	private SampleDAO sampleDAO;
	
	public TestAutowired() {
		this.sampleDAO = new SampleDAOImpl();
	}
}
