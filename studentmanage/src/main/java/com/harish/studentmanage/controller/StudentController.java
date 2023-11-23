package com.harish.studentmanage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.harish.studentmanage.entity.Student;
import com.harish.studentmanage.service.StudentService;

@RestController
@RequestMapping("/student/")
public class StudentController {
	
	@Autowired
	StudentService ss;
	
	@PostMapping("add/")
	public ResponseEntity<String> addStudent(@RequestBody Student s)
	{	
	
		return ss.addStudent(s);
		
	}

	@GetMapping("getall/")
	public ResponseEntity<List<Student>> gettAllStudents()
	{
		return ss.getAllStudents();
	}
	
	@GetMapping("delete/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable int id){
		return ss.deleteStudent(id);
	}
	
}
