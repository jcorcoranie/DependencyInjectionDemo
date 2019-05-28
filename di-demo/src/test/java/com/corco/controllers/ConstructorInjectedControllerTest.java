package com.corco.controllers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.corco.springframework.controllers.ConstructorInjectedController;
import com.corco.services.GreetingServiceImpl;

public class ConstructorInjectedControllerTest {
	
	private ConstructorInjectedController constructorInjectedController;
	
	@Before
	public  void setUp() throws Exception {
		this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
	}

	@Test
	public void test() {
		assertEquals(GreetingServiceImpl.HELLO_MESSAGE, constructorInjectedController.sayHello());
	}

}
