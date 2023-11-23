package org.gfg.jbdl53.l7_springboot_curd_on_employee.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Adress {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String vlg;
	private String state;
	private int pincode;
	public Adress() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVlg() {
		return vlg;
	}
	public void setVlg(String vlg) {
		this.vlg = vlg;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public Adress(String vlg, String state, int pincode) {
		super();
		this.vlg = vlg;
		this.state = state;
		this.pincode = pincode;
	}
	
	

}
