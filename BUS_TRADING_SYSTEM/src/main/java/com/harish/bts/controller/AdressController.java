package com.harish.bts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.harish.bts.entity.Adress;
import com.harish.bts.service.AdressService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/adress")
public class AdressController {
	@Autowired
	private AdressService as;
	
	@GetMapping
	public List<Adress> getall(){
		return as.getall();
	}
	@PostMapping
	public Adress save(@RequestBody @Valid Adress a) {
		return as.save(a);
	}

}
