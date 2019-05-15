package com.corco.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
	
	public static final String HELLO_MESSAGE = "Hello dependency injectors!";

	@Override
	public String sayGreeting() {
		return HELLO_MESSAGE;
	}
}
