package com.fontan.spring.persona.app;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fontan.spring.persona.core.Address;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.notNullValue;
public class AddressTest {
	
	private  ClassPathXmlApplicationContext context;
	private  Address address;

	@BeforeEach
	  void setUp() {
		context = new ClassPathXmlApplicationContext("beans.xml");  
		address =  context.getBean("address", Address.class);	
	}
	
 
	@Test
	void testAddressNotNull() {
		
  
		assertThat(address, notNullValue());
		
	}
	}