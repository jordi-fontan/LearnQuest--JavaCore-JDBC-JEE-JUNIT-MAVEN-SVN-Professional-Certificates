package com.fontan.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestDemoWebApplication {

	public static void main(String[] args) {
		SpringApplication.from(DemoWebApplication::main).with(TestDemoWebApplication.class).run(args);
	}

}
