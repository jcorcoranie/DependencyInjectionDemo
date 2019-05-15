package com.corco.controllers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.corco.springframework.controllers.SetterInjectedController;
import com.corco.springframework.services.GreetingServiceImpl;

public class SetterInjectorControllerTest {
	SetterInjectedController setterInjectedController;
	
	@Before
	public void setUp() {
		this.setterInjectedController = new SetterInjectedController();
		this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
	}
	

	@Test
	public void testGreeting() throws Exception{
		assertEquals(GreetingServiceImpl.HELLO_MESSAGE, setterInjectedController.sayHello());
	}

}
