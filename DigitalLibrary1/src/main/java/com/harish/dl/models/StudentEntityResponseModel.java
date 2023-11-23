package com.harish.dl.models;

public class StudentEntityResponseModel {
	private int id;
	private String name;
	private int age;
	private String email;
	private long phone;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "StudentEntityResponseModel [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email
				+ ", phone=" + phone + "]";
	}
	public StudentEntityResponseModel(int id, String name, int age, String email, long phone) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		this.phone = phone;
	}
	public StudentEntityResponseModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
