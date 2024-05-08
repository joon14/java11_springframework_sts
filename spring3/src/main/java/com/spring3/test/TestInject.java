package com.spring3.test;

import javax.inject.Inject;

import com.spring3.dao.SampleDAO;
import com.spring3.dao.SampleDAOImpl;

public class TestInject {

	@Inject
	private SampleDAO sampleDAO;
	
	public TestInject() {
		this.sampleDAO = new SampleDAOImpl();
	}
}
