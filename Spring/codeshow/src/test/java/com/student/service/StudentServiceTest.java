package com.student.service;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.notNullValue;
public class StudentServiceTest {
	
	private  ClassPathXmlApplicationContext context;
	private  StudentService service;

	@BeforeEach
	  void setUp() {
		context = new ClassPathXmlApplicationContext("beans.xml");  
		service =  context.getBean("studentService", StudentService.class);	
	}
	
 
	@Test
	void testGetOneStudentNotNull() {
		
  
		assertThat(service, notNullValue());
		
	}
	@Test
	void testGetOneFirst() {
		
  
		assertThat(service.get(1).getFirstName().equals("Eric"));
		
	}
	
	@Test
	void testGetFirstNStudents() {
		
  
		assertThat(service.getFirstNStudents().size()==2);
		
	}
	@Test
	void tesGetAll() {
		 service.getAllStudents().forEach(p->{System.out.printf(" %-10s %-10s %n",
				 p.getFirstName(),p.getSurname());
				 });
	}


}
