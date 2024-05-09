package com.spring3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring3.dao.SampleDAO;
import com.spring3.dto.Sample;

@Service
public class SampleServiceImpl implements SampleService {

	@Autowired
	private SampleDAO sampleDAO;
	
	@Override
	public List<Sample> getSampleList() {
		return sampleDAO.getSampleList();
	}

	@Override
	public Sample getSample(int num) {
		return sampleDAO.getSample(num);
	}

	@Override
	public void insSample(Sample sample) {
		sampleDAO.insSample(sample);
		
	}

	@Override
	public void upSample(Sample sample) {
		sampleDAO.upSample(sample);
		
	}

	@Override
	public void delSample(Sample sample) {
		sampleDAO.delSample(sample);
		
	}

	@Override
	public int maxNum() {
		return sampleDAO.maxNum();
	}
	
}
