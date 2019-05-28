package com.corco.controllers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.corco.springframework.controllers.PropertyInjectedController;
import com.corco.services.GreetingServiceImpl;

public class PropertyInjectedControllerTest {
	
	private PropertyInjectedController propertyInjectedController;
	
	@Before
	public void setUp() throws Exception {
		this.propertyInjectedController = new PropertyInjectedController();
		this.propertyInjectedController.greetingService = new GreetingServiceImpl();
		
	}

	@Test
	public void testGreeting() throws Exception {
		assertEquals(GreetingServiceImpl.HELLO_MESSAGE, propertyInjectedController.sayHello());
	}

}
