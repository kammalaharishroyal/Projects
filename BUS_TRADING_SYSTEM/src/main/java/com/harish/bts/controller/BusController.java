package com.harish.bts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.harish.bts.entity.Bus;
import com.harish.bts.service.BusService;

@RestController
@RequestMapping("/bus")
public class BusController {
	@Autowired
	BusService bs;

	@GetMapping
	public ResponseEntity<List<Bus>> getall(){
		return bs.getall();
	}
	@PostMapping
	public Bus SaveBus(@RequestBody Bus b) {
		System.out.println(b);
		return bs.create(b);
	}

}
