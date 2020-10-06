package com.sample.workspace.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sample.workspace.messages.Messages;
import com.sample.workspace.service.MessageProcessor;

@RestController
public class ReadMessageController {
	@Autowired
	MessageProcessor messageProcessor;
	
	@GetMapping("/read-messages")
	private void readMessages() {
		// TODO Auto-generated method stub
		try {
			Messages messages = new ObjectMapper().readValue(new File("src/main/resources/messages.json"), Messages.class);
			messageProcessor.processMessage(messages);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
