package com.fontan.spring.persona.app;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fontan.spring.persona.core.Address;
import com.fontan.spring.persona.core.Persona;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.notNullValue;

public class PersonaTest {


	
	private  ClassPathXmlApplicationContext context;
	private  Persona persona;

	@BeforeEach
	  void setUp() {
		context = new ClassPathXmlApplicationContext("beans.xml");  
		persona =  context.getBean("persona", Persona.class);	
	}
	
 
	@Test
	void testPersonaNotNull() {
		
  
		assertThat(persona.getId()==1);
		
	}
	}