package com.harish.QuizApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.harish.QuizApp.dao.QuestionDao;
import com.harish.QuizApp.dao.QuizDao;
import com.harish.QuizApp.model.Question;
import com.harish.QuizApp.model.Quiz;

@Component
public class QuizService {
	
	@Autowired
	QuizDao qd;
	
	@Autowired
	QuestionDao qda;
	

	public ResponseEntity<String> createQuiz(String category, int numQ, String tittle) {
		List<Question> qs=qda.findRandomQuestionsByCategory(category,numQ);
		Quiz q=new Quiz();
		q.setTittle(tittle);
		q.setQuestions(qs);
		System.out.println("questions:"+qs);
		
		qd.save(q);
		return new ResponseEntity<String>("sucess",HttpStatus.CREATED);
	}
	
	

}
