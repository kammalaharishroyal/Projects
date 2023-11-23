package com.harish.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harish.orderservice.entity.OrderEntity;

public interface OrderRepo  extends JpaRepository<OrderEntity, Integer>{

}
