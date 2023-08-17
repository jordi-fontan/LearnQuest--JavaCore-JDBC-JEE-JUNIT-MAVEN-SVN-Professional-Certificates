package com.fontan.car.web;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fontan.car.domain.Car;
import com.fontan.car.domain.CarRepository;
@RestController
public class CarController {
	private Logger logger=LoggerFactory.getLogger(CarController.class);
	@Autowired
	private CarRepository repository;
	@RequestMapping("/cars")
	public Iterable<Car> getCars() {
		logger.info("Car List requested");
		return repository.findAll();
		
	}
}
