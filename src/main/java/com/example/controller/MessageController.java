package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.MessageService;

@RequestMapping("/message")
@RestController
public class MessageController {

	@Autowired
	private MessageService messageService;
	
	
	@GetMapping("/save")
	public String addMessage() {
		
		
		messageService.saveMessage();
		
		return "message saved";
	}
	
	
}
