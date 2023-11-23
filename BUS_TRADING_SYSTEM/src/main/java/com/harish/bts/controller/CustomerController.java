package com.harish.bts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.harish.bts.entity.Adress;
import com.harish.bts.entity.Customer;
import com.harish.bts.service.CustomerService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	CustomerService service;
	
	@GetMapping("/")
	public String testApi() {
		return " customer API working";
	}
	@GetMapping("/getall")
	public ResponseEntity<List<Customer>> getAll() {
		return service.getAll();
	}
	
	@GetMapping("/getalladress")
	public ResponseEntity<List<Adress>> getAlla() {
		return service.getAlla();
	}
	
	@PostMapping("/save")
	public ResponseEntity<String> save(@RequestBody @Valid Customer c){
		return service.save(c);
	}

}
