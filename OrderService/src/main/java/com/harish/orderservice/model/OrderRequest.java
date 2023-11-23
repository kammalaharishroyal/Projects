package com.harish.orderservice.model;

import java.util.List;
public class OrderRequest {
	
	List<OrderItemsModel> orderItemsModelsList;

	public List<OrderItemsModel> getOrderItemsModelsList() {
		return orderItemsModelsList;
	}

	public void setOrderItemsModelsList(List<OrderItemsModel> orderItemsModelsList) {
		this.orderItemsModelsList = orderItemsModelsList;
	} 
	
	

}
