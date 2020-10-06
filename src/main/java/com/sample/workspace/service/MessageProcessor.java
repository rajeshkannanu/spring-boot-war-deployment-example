package com.sample.workspace.service;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sample.workspace.messages.Message;
import com.sample.workspace.messages.Messages;
import com.sample.workspace.model.APIStats;

@Service
public class MessageProcessor {
	
	
	public String processMessage(Messages messages) {
		// TODO Auto-generated method stub
		List<Message> messagesList = messages.getMessages();
		messagesList.stream().forEach((m -> callService(m)));
		return "Success";
	}

	private void callService(Message m) {
		// TODO Auto-generated method stub
		if(m.getMessage().equals("01")) {
			System.out.println("Successfuly called" + m.getMessage());
			//cityRepository.save(m);
			final String uri = "http://localhost:8080/save-messages";
		    RestTemplate restTemplate = new RestTemplate();
		    Timestamp createdTimestamp = new Timestamp(System.currentTimeMillis());

		 
		    APIStats apistats = new APIStats(m.getMessage(),m.getCaller(),createdTimestamp.toString(),createdTimestamp.toString(),"admin","admin","success","NA");
		     
		    APIStats result = restTemplate.postForObject( uri, apistats, APIStats.class);
		 
		    System.out.println(result);
		}else {
			
		}
		
	}

}
