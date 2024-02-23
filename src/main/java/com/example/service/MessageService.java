package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.entity.Message;
import com.example.repo.MessageRepository;

@Service
public class MessageService {

	@Autowired
	private MessageRepository messageRepository;
	
	
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public void saveMessage() {
		
		Message message = new Message();
		//message.setMsgId(5001);
		message.setResponse("hello6");
		
		messageRepository.save(message);
		
		System.out.println("arithmatic error "+50/0);
		
		
	}
	
	
	
	
	
}
