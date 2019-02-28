package com.threeD.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.threeD.entity.JobEntity;
import com.threeD.entity.TestOne;
import com.threeD.service.JobRepository;
import com.threeD.service.JobServices;

@RestController()
@CrossOrigin("*")
public class JobController {
	
	@Autowired
	private JobServices js;
	
	@Autowired
	private JobRepository jr;
	
	@GetMapping("all/job")
	public List<TestOne> getAllJobs(){
		return js.getAllJob();
		
	}
	
	
	
	
	
	
	
	
//	@GetMapping("all/job/{jobId}")
//	public TestOne getJobById (@PathVariable("jobId") String jobId) {
//		return js.findJobByName(jobId);
//	}
	
	

}