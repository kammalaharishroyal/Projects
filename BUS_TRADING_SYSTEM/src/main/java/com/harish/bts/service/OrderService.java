package com.harish.bts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.harish.bts.entity.Order1;
import com.harish.bts.model.OrderResponseModel;
import com.harish.bts.model.TakeOrder;
import com.harish.bts.repositories.OrderRepository;
@Service
public class OrderService {
	@Autowired
	private OrderRepository or;
	@Autowired
	private BusService bs;
	@Autowired
	private CustomerService cs;
	@Autowired
	private DriverService ds;

	public ResponseEntity<List<OrderResponseModel>> getall() {
		List<Order1> ls=or.findAll();
		List<OrderResponseModel> lorm=ls.stream().map(x->toORM(x)).toList();
		return new ResponseEntity<>(lorm,HttpStatus.OK);
	}

	private OrderResponseModel toORM(Order1 x) {
		OrderResponseModel xx=new OrderResponseModel(x.getId(),x.getCustomer_id().getName(),x.getDriver_id().getId(),x.getDriver_id().getName(),x.getBus_id().getNumber(),x.getAid().getPinCode());
		return xx;
	}

	public Order1 takeorder(TakeOrder to) {
		
		Order1 o1=new Order1(ds.getById(1),bs.getById(to.getBid()),cs.getById(to.getCid()),to.getA());
		
		return or.save(o1);
	}

}
