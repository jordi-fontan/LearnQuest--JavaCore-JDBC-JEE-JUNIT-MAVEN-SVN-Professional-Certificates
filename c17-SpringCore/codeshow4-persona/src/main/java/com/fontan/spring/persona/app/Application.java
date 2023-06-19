package com.fontan.spring.persona.app;
import com.fontan.spring.persona.core.Address;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Application {
	static ApplicationContext ctx;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		ctx=new ClassPathXmlApplicationContext("beans.xml");
		Address address=(Address)ctx.getBean("address");
		System.out.printf(" %s %s",address.getStreet(),address.getZip());
		
	}
}



