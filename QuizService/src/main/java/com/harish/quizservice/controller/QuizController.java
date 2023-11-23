package com.harish.quizservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.harish.quizservice.model.QuestionWrapper;
import com.harish.quizservice.model.QuizDto;
import com.harish.quizservice.model.Responses;
import com.harish.quizservice.service.QuizService;

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
	public ResponseEntity<String> createQuiz(@RequestBody QuizDto qdt){
//		System.out.println("category"+category+"\nnumQ:"+numQ+"\ntittle:"+tittle);
		return quizservice.createQuiz(qdt.getCategory(),qdt.getNumQ(),qdt.getTitle());
	}
	@GetMapping("get/{id}")
	public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(@PathVariable int id){
		return quizservice.getQuizQuestions(id);
	}
	
	@PostMapping("submit/{id}")
	public ResponseEntity<Integer> submitQuiz(@PathVariable int id,@RequestBody Responses r){
		return quizservice.submitQuiz(id,r);
	}
	

}
