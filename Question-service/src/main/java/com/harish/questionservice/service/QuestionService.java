package com.harish.questionservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.harish.questionservice.dao.QuestionDao;
import com.harish.questionservice.model.Question;
import com.harish.questionservice.model.QuestionWrapper;
import com.harish.questionservice.model.Responses;


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

	public ResponseEntity<List<Integer>> getQuestionsForQuiz(String category, int noQ) {
		List<Integer> qs=qd.findRandomQuestionsByCategory(category,noQ);

		return new ResponseEntity<>(qs,HttpStatus.OK);
	}

	public ResponseEntity<List<QuestionWrapper>> getQuestions(List<Integer> questionIds) {
		// TODO Auto-generated method stub
		
		List<Question> questions=qd.findAllById(questionIds);
		List<QuestionWrapper> qw=questions.stream().map(x->questionMapToQuestionWrapper(x)).toList();
		System.out.println("questions:"+questions);
		System.out.println("questions:"+qw);
		return new ResponseEntity<>(qw,HttpStatus.OK);
	}

	private QuestionWrapper questionMapToQuestionWrapper(Question x) {
		QuestionWrapper q=new QuestionWrapper();
		q.setId(x.getId());
		q.setQuestionTittle(x.getQuestionTittle());
		q.setOption1(x.getOption1());
		q.setOption2(x.getOption2());
		q.setOption3(x.getOption3());
		q.setOption4(x.getOption4());
		
		return q;
	}

	public ResponseEntity<Integer> getScore(List<Responses> rs) {
		int right=0;
		for(Responses r:rs)
		{	
			Question q=qd.findById(r.getId()).get();
			if(r.getResponse().equals(q.getRightAnswer())) {
				right+=1;
			}
		}
		return new ResponseEntity<>(right,HttpStatus.OK);
	}

	public ResponseEntity<List<Responses>> getScore() {
		List<Responses> qsd=null;
		return new ResponseEntity<>(qsd,HttpStatus.OK);
	}

	

	

}
