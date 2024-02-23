package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.entity.User;
import com.example.repo.MessageRepository;
import com.example.repo.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private MessageService messageService;
	
	@Transactional(propagation =  Propagation.REQUIRED)
	public void saveUser() {
		
		User user = new User();
		//user.setUserId(101);
		user.setName("eunil");
		user.setEmail("eunil@gmail.com");
		userRepo.save(user);
		//messageService = null;
		messageService.saveMessage();
		System.out.println("arithmatic error "+50/0);
		
	}
	
	
}
