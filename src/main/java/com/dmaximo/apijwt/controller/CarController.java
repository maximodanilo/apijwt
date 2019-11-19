package com.dmaximo.apijwt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dmaximo.apijwt.model.Car;
import com.dmaximo.apijwt.service.CarService;

@RestController
@RequestMapping("/api")
public class CarController {

	@Autowired
	CarService carService;

	@GetMapping("/cars")
	public List<Car> getCars() {
		return carService.findAll();
	}

	@PostMapping("/cars")
	public Car saveCar(@RequestBody Car car) {
		car.setId(0);
		Car savedCar = carService.save(car);
		return savedCar;
	}
	
	@GetMapping("/cars/{model}")
	public Car getCar(@PathVariable Integer carId) {
		Car car = carService.
		
		return car;
	}
	

}
