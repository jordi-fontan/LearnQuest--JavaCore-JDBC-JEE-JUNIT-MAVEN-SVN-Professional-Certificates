package com.fontan.car;

import java.io.File;
import java.util.Arrays;

import javax.annotation.Resource;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fontan.car.domain.Car;
import com.fontan.car.domain.CarRepository;
import com.fontan.car.domain.Owner;
import com.fontan.car.domain.OwnerRepository;
import com.fontan.car.domain.UserApp;
import com.fontan.car.domain.UserAppRepository;

@SpringBootApplication
public class CardsApplication implements CommandLineRunner{
	
	private static final org.slf4j.Logger logger= LoggerFactory.getLogger(CardsApplication.class);
	
	@Autowired
	private UserAppRepository urepository;
	
	@Autowired
	private CarRepository repository;
	
	@Autowired
	private OwnerRepository orepository;
	
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
		
		Owner owner1 = new Owner("John" , "Johnson");
		Owner owner2 = new Owner("Mary" , "Robinson");
		orepository.saveAll(Arrays.asList(owner1,
		owner2));
		Car c=new Car("Ford","Mustang","Red","ADF-1121", 2021, 59000,owner1);
		repository.save(c);
		repository.save(new Car("Nissan", "Leaf","White","SSJ-3002", 2019, 29000,owner2));
		repository.save(new Car("Toyota", "Prius","Silver","KKO-0212", 2020, 39000,owner2));
	
		// Username: user, password: user
		urepository.save(new UserApp("user",
		"$2a$10$NVM0n8ElaRgg7zWO1CxUdei7vWoPg91Lz2aYavh9.f9q0e4bRadue","USER"));
		// Username: admin, password: admin
		urepository.save(new UserApp("admin",	"$2a$10$8cjz47bjbR4Mn8GMg9IZx.vyjhLXR/SKKMSZ9.mP9vpMu0ssKi8GW", "ADMIN"));
		
		for(Car car: repository.findAll()) {
			logger.info("Found car " + car.getBrand() + " " +car.getModel() + " at database, owned by " +car.getOwner().toString());
		}
	}

}
