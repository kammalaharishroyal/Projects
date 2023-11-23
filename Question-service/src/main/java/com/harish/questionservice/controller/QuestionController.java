package com.harish.questionservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.harish.questionservice.model.Question;
import com.harish.questionservice.model.QuestionWrapper;
import com.harish.questionservice.model.Responses;
import com.harish.questionservice.service.QuestionService;


@RestController
@RequestMapping("question/")
public class QuestionController {
	
	@Autowired
	QuestionService qs;
	@Autowired
	Environment env;
	
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
	
	@GetMapping("generate")
	public ResponseEntity<List<Integer>> getQuestionsForQuiz(@RequestParam String category,@RequestParam int noQ){
		return qs.getQuestionsForQuiz(category,noQ);
	}
	@PostMapping("getQuestions")
	public ResponseEntity<List<QuestionWrapper>> getQuestions(@RequestBody List<Integer> questionIds){
		System.out.println(env.getProperty("local.server.port"));
		return qs.getQuestions(questionIds);
	}
	@PostMapping("getscore")
	public ResponseEntity<Integer> getScore(@RequestBody List<Responses> rs){
		return qs.getScore(rs);
	}
	
	

}
