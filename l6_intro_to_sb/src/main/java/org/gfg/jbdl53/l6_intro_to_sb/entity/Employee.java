package org.gfg.jbdl53.l6_intro_to_sb.entity;

public class Employee {
	
	public int id;
	public String name;
	public int sal;
	public String dept;
	public Employee(int id, String name, int sal, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + ", dept=" + dept + "]";
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
