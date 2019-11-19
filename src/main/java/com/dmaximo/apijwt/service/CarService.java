package com.dmaximo.apijwt.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dmaximo.apijwt.model.Car;
import com.dmaximo.apijwt.repository.CarRepository;

@Service
public class CarService {

	@Autowired
	private CarRepository carRepository;

	public List<Car> findAll() {
		return carRepository.findAll();
	}

	@Transactional
	public Car save(Car car) {

		Car savedCar = carRepository.save(car);

		return savedCar;
	}
	
	public Car findById(Integer id) {
		Car savedCar = carRepository.findOne(id);

		return savedCar;
	}

}
