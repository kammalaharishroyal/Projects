package com.harish.quizservice1.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.harish.quizservice1.model.QuestionWrapper;
import com.harish.quizservice1.model.Responses;


@FeignClient("QUESTION-SERVICE")
public interface QuizFeign {
	
	@GetMapping("question/generate")
	public ResponseEntity<List<Integer>> getQuestionsForQuiz(@RequestParam String category,@RequestParam int noQ);
	
	@PostMapping("question/getQuestions")
	public ResponseEntity<List<QuestionWrapper>> getQuestions(@RequestBody List<Integer> questionIds);
	
	@PostMapping("question/getscore")
	public ResponseEntity<Integer> getScore(@RequestBody List<Responses> rs);
}
