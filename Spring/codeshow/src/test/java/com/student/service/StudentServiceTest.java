package com.student.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.notNullValue;
public class StudentServiceTest {
	
	private ClassPathXmlApplicationContext context;
	private StudentService service;

	@BeforeEach
	void setUp() {
		context = new ClassPathXmlApplicationContext("beans.xml");  
			}
	
 
	@Test
	void testGetOneStudent() {
		service =  context.getBean("studentService", StudentService.class);
  
		assertThat(service, notNullValue());
	}
	@Test
	void tesGetAll() {
		 
	}


}
