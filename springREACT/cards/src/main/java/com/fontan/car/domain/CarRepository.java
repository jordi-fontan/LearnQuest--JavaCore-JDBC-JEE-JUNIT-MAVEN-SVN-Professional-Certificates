package com.fontan.car.domain;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
public interface CarRepository extends PagingAndSortingRepository<Car, Long> {
	// Fetch cars by brand
	//List<Car> findByBrand(String brand);
	// Fetch cars by color
	List<Car> findByColor(String color);
	// Fetch cars by year
	List<Car> findByYear(int year);
	// Fetch cars by brand and model
	List<Car> findByBrandAndModel(String brand, String
	model);
	List<Car> findByBrandOrColor(String brand, String
			color);
	// Fetch cars by brand and sort by year
	List<Car> findByBrandOrderByYearAsc(String brand);
	// Fetch cars by brand using SQL
	@Query("select c from Car c where c.brand = ?1")
	List<Car> findByBrand(String brand);
	
	// Fetch cars by brand using SQL
//	@Query("select c from Car c where c.brand like 	%?1")
//	List<Car> findByBrandEndsWith(String brand);
}
