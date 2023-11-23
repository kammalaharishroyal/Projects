package com.harish.productservice.dto;

import java.math.BigDecimal;

public class ProductRequest {
	
	private String name;
	private String desc;
	private BigDecimal price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "ProductRequest [name=" + name + ", desc=" + desc + ", price=" + price + "]";
	}
	public ProductRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductRequest(String name, String desc, BigDecimal price) {
		super();
		this.name = name;
		this.desc = desc;
		this.price = price;
	}
	
	

}
