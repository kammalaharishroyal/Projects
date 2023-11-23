package org.gfg.jbdl53.l7_springboot_curd_on_employee.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	public String name;
	public int sal;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "ea_fk",referencedColumnName = "id")
	private List<Adress> adrs;
		public List<Adress> getAdrs() {
		return adrs;
	}

	public void setAdrs(List<Adress> adrs) {
		this.adrs = adrs;
	}

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

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int id, String name, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}

	public Employee(String name, int sal, List<Adress> adrs) {
		super();
		this.name = name;
		this.sal = sal;
		this.adrs = adrs;
	}

}

