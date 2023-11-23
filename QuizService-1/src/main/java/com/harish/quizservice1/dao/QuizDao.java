package com.harish.quizservice1.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.harish.quizservice1.model.Quiz;



@Repository
public interface QuizDao extends JpaRepository<Quiz,Integer> {

}
