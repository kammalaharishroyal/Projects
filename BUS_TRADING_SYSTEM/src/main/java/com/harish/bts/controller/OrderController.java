package com.harish.bts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.harish.bts.entity.Order1;
import com.harish.bts.model.OrderResponseModel;
import com.harish.bts.model.TakeOrder;
import com.harish.bts.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	@Autowired
	private OrderService os;
	@GetMapping
	public String test() {
		return "order Controller Working";
	}
	@GetMapping("/all")
	public ResponseEntity<List<OrderResponseModel>> getall(){
		return os.getall();
	}
	@PostMapping
	public Order1 takeOrder(@RequestBody TakeOrder to)
	{	
		return os.takeorder(to);
	}
	}
