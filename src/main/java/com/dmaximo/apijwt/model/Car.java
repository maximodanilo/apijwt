package com.dmaximo.apijwt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(unique = true, nullable = false)
	private String model;

	@Column(unique = false, nullable = false)
	private String brand;

	public Car() {
	}

	public Car(String model, String brand) {
		super();
		this.model = model;
		this.brand = brand;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", model=" + model + ", brand=" + brand + "]";
	}

}
