package com.harish.bts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harish.bts.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
