package com.harish.bts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.harish.bts.entity.Bus;
import com.harish.bts.repositories.BusRepository;

@Service
public class BusService {
	@Autowired
	BusRepository bsr;

	public ResponseEntity<List<Bus>> getall() {
		// TODO Auto-generated method stub
		List<Bus> bss=bsr.findAll();
		return new ResponseEntity<>(bss,HttpStatus.OK);
	}

	public Bus create(Bus b) {
		// TODO Auto-generated method stub
		
		return bsr.save(b);
	}

	public Bus getById(int bid) {
		// TODO Auto-generated method stub
		return bsr.findByNumber(bid);
	}
	
}
