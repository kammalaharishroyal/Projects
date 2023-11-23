package com.harish.bts.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Adress {
	
	@Id
	private int id;
	@NotBlank
	private String village;
	@NotBlank
	private String mandal;
	@NotBlank
	private String district;
	@NotBlank
	private String state;
	@NotBlank
	private int pinCode;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	public String getMandal() {
		return mandal;
	}
	public void setMandal(String mandal) {
		this.mandal = mandal;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "Adress [id=" + id + ", village=" + village + ", mandal=" + mandal + ", district=" + district
				+ ", state=" + state + ", pinCode=" + pinCode + "]";
	}
	
	
}
