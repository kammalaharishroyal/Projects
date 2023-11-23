package com.harish.bts.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

@Entity
public class Driver {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id;
	@NotNull
	private String name;
	@Pattern(regexp = "\\d{10}",message = "mobile number should be 10 digits")
	private String mobile;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return mobile;
	}
	public void setNumber(String number) {
		this.mobile = number;
	}
	@Override
	public String toString() {
		return "Driver [id=" + id + ", name=" + name + ", number=" + mobile + "]";
	}
	public Driver(int id, String name, String number) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = number;
	}
	public Driver() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
