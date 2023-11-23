package com.harish.QuizApp.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Entity
@Data
public class Quiz {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int quizId;
	
	private String tittle;
	
	@ManyToMany
	private List<Question> questions;

	public int getQuizId() {
		return quizId;
	}

	public void setQuizId(int quizId) {
		this.quizId = quizId;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	@Override
	public String toString() {
		return "Quiz [quizId=" + quizId + ", tittle=" + tittle + ", questions=" + questions + "]";
	}

	public Quiz(int quizId, String tittle) {
		super();
		this.quizId = quizId;
		this.tittle = tittle;
	}

	public Quiz() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
