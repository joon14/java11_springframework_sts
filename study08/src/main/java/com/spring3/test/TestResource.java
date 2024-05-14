package com.spring3.test;

import javax.annotation.Resource;

import com.spring3.dao.SampleDAO;
import com.spring3.dao.SampleDAOImpl;

public class TestResource {

	@Resource(name="testDAO")
	private SampleDAO sampleDAO;
	
	public TestResource() {
		this.sampleDAO = new SampleDAOImpl();
	}
}
