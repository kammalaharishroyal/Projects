package com.harish.bts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harish.bts.entity.Driver;
import com.harish.bts.repositories.DriverRepo;

import jakarta.validation.Valid;
@Service
public class DriverService {
	
	@Autowired
	private DriverRepo dr;
	public List<Driver> getAll() {
		
		return dr.findAll();
	}
	public Driver getById(int i) {
		
		return dr.findById(i).get();
	}
	public Driver create(@Valid Driver d) {
		// TODO Auto-generated method stub
		return dr.save(d);
	}

}
