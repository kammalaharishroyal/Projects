package com.harish.QuizApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.harish.QuizApp.model.Question;
import com.harish.QuizApp.service.QuestionService;

@RestController
@RequestMapping("question/")
public class QuestionController {
	
	@Autowired
	QuestionService qs;
	
	@GetMapping("test")
	public String testApi() {
		return "questionservice-quiz is workingg";
	}
	
	@GetMapping("getall")
	public ResponseEntity<List<Question>> getAll(){
		return qs.getAll();
	}
	
	@PostMapping("create")
	public ResponseEntity<String> create(@RequestBody Question q) {
		
		return qs.create(q);
		
	}
	

}
