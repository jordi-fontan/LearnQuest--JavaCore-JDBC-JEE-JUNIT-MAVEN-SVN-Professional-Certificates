package com.fontan.spring.pokemon;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.notNullValue;

public class DriverTest {
	private  ClassPathXmlApplicationContext context;
	@Test
	public void driverCallsMove() {
		context = new ClassPathXmlApplicationContext("beans.xml");  
		
		Vehicle falseVehicle=mock(Vehicle.class);
		Driver dr=new Driver(falseVehicle);
		dr.drive();
		verify(falseVehicle, times(1)).move();
	}
	private  Driver driver;

	@BeforeEach
	  void setUp() {
		context = new ClassPathXmlApplicationContext("beans.xml");  
		
		Vehicle sv=context.getBean("svehicle", Vehicle.class);
		//driver =  context.getBean("driver", Driver.class);	
	}
	
 
	@Test
	void testGetOneStudentNotNull() {
		
  
		assertThat(driver, notNullValue());
		
	}
	@Test
	void testGetOneFirst() {
		
  
		assertThat(driver.getVehicle().getPetrolTank()==1);
		
	}
	
	
}





