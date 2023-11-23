package com.harish.bts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.harish.bts.entity.Order1;

@Repository
public interface OrderRepository extends JpaRepository<Order1, Integer> {

}
