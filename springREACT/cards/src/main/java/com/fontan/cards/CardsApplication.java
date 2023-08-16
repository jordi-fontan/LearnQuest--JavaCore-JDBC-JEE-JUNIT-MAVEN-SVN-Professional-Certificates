package com.fontan.cards;

import java.io.File;

import javax.annotation.Resource;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fontan.cards.database.domain.Car;
import com.fontan.cards.database.domain.CarRepository;

@SpringBootApplication
public class CardsApplication implements CommandLineRunner{
	
	private static final org.slf4j.Logger logger= LoggerFactory.getLogger(CardsApplication.class);
	@Autowired
	private CarRepository repository;
	@Resource(name="configFile")
	private File cFile;
	public static void main(String[] args) {
		// Entry point
		
		SpringApplication.run(CardsApplication.class, args);
		logger.info("Application Started");
		
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Car c=new Car("Ford","Mustang","Red","ADF-1121", 2021, 59000);
		repository.save(c);
		repository.save(new Car("Nissan", "Leaf","White","SSJ-3002", 2019, 29000));
		repository.save(new Car("Toyota", "Prius","Silver","KKO-0212", 2020, 39000));
	
		for(Car car: repository.findAll()) {
			logger.info("Found car " + car.getBrand() + " " +car.getModel() + " at database");
		}
	}

}
