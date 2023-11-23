package com.harish.bts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harish.bts.entity.Adress;
import com.harish.bts.repositories.AdresseRepository;

import jakarta.validation.Valid;

@Service
public class AdressService {
	@Autowired
	private AdresseRepository ar;

	public List<Adress> getall() {
		
		return ar.findAll();
	}

	public Adress save(@Valid Adress a) {
		// TODO Auto-generated method stub
		return ar.save(a);
	}
	
	

}
