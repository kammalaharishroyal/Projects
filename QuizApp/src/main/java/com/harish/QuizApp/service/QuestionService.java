package com.harish.QuizApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.harish.QuizApp.dao.QuestionDao;
import com.harish.QuizApp.model.Question;

@Component
public class QuestionService {
	
	@Autowired
	QuestionDao qd;

	public ResponseEntity<List<Question>> getAll() {
		List<Question> ls=qd.findAll();
		
		return new ResponseEntity<List<Question>>(ls, HttpStatus.OK);
	}

	public ResponseEntity<String> create(Question q) {
		System.out.println(q);
		qd.save(q);
		return new ResponseEntity<String>("success",HttpStatus.OK);
	}

	

}
