package com.harish.bts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.harish.bts.entity.Adress;
import com.harish.bts.entity.Customer;
import com.harish.bts.repositories.AdressRepository;
import com.harish.bts.repositories.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository cp;
	
	@Autowired
	AdressRepository ar;

	public ResponseEntity<List<Customer>> getAll() {
		List<Customer> customer=cp.findAll();
		return new ResponseEntity<>(customer,HttpStatus.OK);
	}

	public ResponseEntity<List<Adress>> getAlla() {
		List<Adress> adress=ar.findAll();
		System.out.println(adress);
		return new ResponseEntity<>(adress,HttpStatus.OK);
	}

	public ResponseEntity<String> save(Customer c) {
		cp.save(c);
		return new ResponseEntity<String>("success",HttpStatus.CREATED);
	}

	public Customer getById(int cid) {
		
		return cp.findById(cid).get();
	}
	

}
