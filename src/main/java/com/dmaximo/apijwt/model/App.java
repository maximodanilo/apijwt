package com.dmaximo.apijwt.model;

import javax.persistence.Entity;

@Entity
public class App {

	private Integer id;
	private String name;
	private String status;
	private String code;
	
	public App() {
	}

	
	public App(String name, String status, String code) {
		super();
		this.name = name;
		this.status = status;
		this.code = code;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
}
