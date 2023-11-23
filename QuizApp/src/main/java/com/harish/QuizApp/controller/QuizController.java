package com.harish.QuizApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.harish.QuizApp.service.QuizService;

@RestController
@RequestMapping("quiz/")
public class QuizController {
	
	@Autowired
	QuizService quizservice;
	
	@GetMapping("test")
	public String testQuiz() {
		return "test quiz is working";
	}
	
	@PostMapping("create")
	public ResponseEntity<String> createQuiz(@RequestParam String category,@RequestParam  int numQ,@RequestParam String tittle){
		System.out.println("category"+category+"\nnumQ:"+numQ+"\ntittle:"+tittle);
		return quizservice.createQuiz(category,numQ,tittle);
	}
	

}
