package org.gfg.jbdl53.l7_springboot_curd_on_employee.model;

public class CreateEmployeeResponse {

	
	
	public int id;
	public String name;
	public int sal;
	public String dept;
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public CreateEmployeeResponse(int id, String name, int sal, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.dept = dept;
	}
	public CreateEmployeeResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CreateEmployeeResponse [id=" + id + ", name=" + name + ", sal=" + sal + ", dept=" + dept + "]";
	}
	
}
