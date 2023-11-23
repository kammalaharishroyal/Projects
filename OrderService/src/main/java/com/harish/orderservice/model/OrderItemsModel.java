package com.harish.orderservice.model;

public class OrderItemsModel {
	private int id;
	private String skuCode;
	private int price;
	private int quantity;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSkuCode() {
		return skuCode;
	}
	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "OrderItemsModel [id=" + id + ", skuCode=" + skuCode + ", price=" + price + ", quantity=" + quantity
				+ "]";
	}
	public OrderItemsModel(int id, String skuCode, int price, int quantity) {
		super();
		this.id = id;
		this.skuCode = skuCode;
		this.price = price;
		this.quantity = quantity;
	}
	public OrderItemsModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

