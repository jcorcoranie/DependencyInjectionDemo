package com.corco.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.corco.springframework.services.GreetingServiceImpl;

// This is bad! business. You should never actually inject properties.......

@Controller
public class PropertyInjectedController {
	
	@Autowired
	public GreetingServiceImpl greetingService;
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}

}
