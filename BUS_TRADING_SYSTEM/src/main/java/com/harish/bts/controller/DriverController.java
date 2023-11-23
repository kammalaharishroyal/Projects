package com.harish.bts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.harish.bts.entity.Driver;
import com.harish.bts.service.DriverService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/driver/")
public class DriverController {
	@Autowired
	private DriverService ds;
	
	@GetMapping("")
	public String testApi() {
		return "testApi is Working";
	}
	@GetMapping("getall")
	public List<Driver> getAll(){
		return ds.getAll();
	}
	@PostMapping
	public Driver create(@RequestBody @Valid Driver d) {
		return ds.create(d);
	}

}
