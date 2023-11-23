package org.gfg.jbdl53.l7_springboot_curd_on_employee.controller;

import java.util.List;

import org.gfg.jbdl53.l7_springboot_curd_on_employee.entity.Employee;
import org.gfg.jbdl53.l7_springboot_curd_on_employee.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp/")
public class employeeController {
	@Autowired
	private EmployeeRepo er;
	@GetMapping("getall")
	public List<Employee> getAll(){
		return er.findAll();
	}
	@GetMapping("create")
	public Employee create(@RequestBody Employee e) {
		return er.save(e);
	}

}
