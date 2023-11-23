package com.harish.bts.entity;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Order1 {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Driver driver_id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Bus bus_id;
	@ManyToOne(cascade = CascadeType.ALL)
	private Customer customer_id;
	@ManyToOne
	private Adress aid;
	
	public Adress getAid() {
		return aid;
	}

	public void setAid(Adress aid) {
		this.aid = aid;
	}

	public Order1(Bus bus_id, Customer customer_id, Adress aid) {
		super();
		this.bus_id = bus_id;
		this.customer_id = customer_id;
		this.aid = aid;
	}

	public Order1(int id, Driver driver_id, Bus bus_id, Customer customer_id, Adress aid) {
		super();
		this.id = id;
		this.driver_id = driver_id;
		this.bus_id = bus_id;
		this.customer_id = customer_id;
		this.aid = aid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Driver getDriver_id() {
		return driver_id;
	}

	public void setDriver_id(Driver driver_id) {
		this.driver_id = driver_id;
	}

	public Bus getBus_id() {
		return bus_id;
	}

	public void setBus_id(Bus bus_id) {
		this.bus_id = bus_id;
	}

	public Customer getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(Customer customer_id) {
		this.customer_id = customer_id;
	}

	public Order1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order1(int id, Driver driver_id, Bus bus_id, Customer customer_id) {
		super();
		this.id = id;
		this.driver_id = driver_id;
		this.bus_id = bus_id;
		this.customer_id = customer_id;
	}

	public Order1(Driver driver_id, Bus bus_id, Customer customer_id, Adress aid) {
		super();
		this.driver_id = driver_id;
		this.bus_id = bus_id;
		this.customer_id = customer_id;
		this.aid = aid;
	}

	@Override
	public String toString() {
		return "Order1 [id=" + id + ", driver_id=" + driver_id + ", bus_id=" + bus_id + ", customer_id=" + customer_id
				+ ", aid=" + aid + "]";
	}

	

	
	
	

}
