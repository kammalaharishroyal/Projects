package com.harish.quizservice1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.harish.quizservice1.dao.QuizDao;
import com.harish.quizservice1.feign.QuizFeign;
import com.harish.quizservice1.model.QuestionWrapper;
import com.harish.quizservice1.model.Quiz;
import com.harish.quizservice1.model.Responses;

@Component
public class QuizService {
	
	@Autowired
	QuizDao qd;
	@Autowired
	QuizFeign quizFeign;
	public ResponseEntity<String> createQuiz(String category, int numQ, String tittle) {
		
		List<Integer> qIds=quizFeign.getQuestionsForQuiz(category, numQ).getBody();
		Quiz q=new Quiz() ;
		q.setQuestions(qIds);
		q.setTittle(tittle);
		qd.save(q);
		
		return new ResponseEntity<String>("sucess",HttpStatus.CREATED);
	}


	public ResponseEntity<Integer> submitQuiz(List<Responses> r) {
		
		return quizFeign.getScore(r);
	}


	public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(int id) {
		Quiz quiz=qd.findById(id).get();
		System.out.println("quiz:"+quiz);
		List<QuestionWrapper> questionWrappers=quizFeign.getQuestions(quiz.getQuestions()).getBody();
		return new ResponseEntity<>(questionWrappers,HttpStatus.OK);
	}
	
	

}
