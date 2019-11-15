package com.dmaximo.apijwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dmaximo.apijwt.model.Car;

public interface CarRepository extends JpaRepository<Car, Integer> {

	boolean existsByModel(String model);

	Car findByModel(String model);
}
