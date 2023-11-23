package org.gfg.jbdl53.l7_springboot_curd_on_employee.controller;

import java.util.List;

import org.gfg.jbdl53.l7_springboot_curd_on_employee.entity.Adress;
import org.gfg.jbdl53.l7_springboot_curd_on_employee.repo.AdressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/adress/")
public class AdressController {
	@Autowired
	private AdressRepo ar;
	
	@GetMapping("getall")
	public List<Adress> getAll(){
		return ar.findAll();
	}
	@PostMapping("create")
	public Adress create(@RequestBody Adress a) {
		return ar.save(a);
	}

}