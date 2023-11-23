package com.harish.orderservice.service;

import java.util.List;
import java.util.UUID;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.harish.orderservice.entity.OrderEntity;
import com.harish.orderservice.entity.OrderItems;
import com.harish.orderservice.model.OrderItemsModel;
import com.harish.orderservice.model.OrderRequest;
import com.harish.orderservice.repository.OrderRepo;

@Service
@Transactional
public class OrderService {
	
	@Autowired
	private OrderRepo or;

	public String placeOrder(OrderRequest oreq) {
		
		OrderEntity oe=new OrderEntity();
		oe.setOrderNumber(UUID.randomUUID().toString());
		List<OrderItems> oi=oreq.getOrderItemsModelsList().stream().map(t1->toOrderitems(t1)).toList();
		List<String> skucodes=oreq.getOrderItemsModelsList().stream().map(t1->toOrderitems(t1).getSkuCode()).toList();
		
		System.out.println("skucodes list"+skucodes);
		oe.setOrderItems(oi);
		
		or.save(oe);
		return "order placed success";
	}

	private OrderItems toOrderitems(OrderItemsModel t1) {
		OrderItems t2=new OrderItems();
		t2.setId(t1.getId());
		t2.setPrice(t1.getPrice());
		t2.setQuantity(t1.getQuantity());
		t2.setSkuCode(t1.getSkuCode());

		return t2;
	}

	

}
