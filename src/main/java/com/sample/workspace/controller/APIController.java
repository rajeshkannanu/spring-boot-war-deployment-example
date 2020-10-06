package com.sample.workspace.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.workspace.model.APIStats;
import com.sample.workspace.repository.APIStatsRepository;

@RestController
public class APIController {
	
	@Autowired
	APIStatsRepository apiStatsRepository;
	
	@PostMapping("/save-messages")
	private void putmessages(APIStats apiStats) {
		// TODO Auto-generated method stub
		System.out.println("Succefully Called");
		apiStatsRepository.save(apiStats);
		System.out.println("Executed ");
		
		
	}

}
