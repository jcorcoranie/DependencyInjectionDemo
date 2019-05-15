package com.corco.springframework.controllers;

import org.springframework.stereotype.Controller;

import com.corco.springframework.services.GreetingService;

@Controller
public class MyController {
	
	private GreetingService greetingService;
	
	
	public MyController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}


	public void hello() {
		System.out.println("Hello!!!");
	}

}
