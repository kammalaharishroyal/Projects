package com.harish.quizservice.model;

import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Quiz {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int quizId;
	
	private String tittle;
	
	@ElementCollection
	private List<Integer> questions;

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

	public List<Integer> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Integer> questions) {
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
