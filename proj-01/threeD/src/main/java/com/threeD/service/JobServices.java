package com.threeD.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.threeD.entity.JobEntity;
import com.threeD.entity.TestOne;

@Service
public class JobServices implements JobServiceInterface {

	@Autowired
	private JobRepository jr;
	
	@Override
	public List<TestOne> getAllJob() {
		return jr.findAll();		

	}

	
	
	
	
	
	
	
	
//	@Override
//	public TestOne findJobByName(String jobId) {
//		// TODO Auto-generated method stub
//		return jr.findJobByName(jobId);
//	}

	

}