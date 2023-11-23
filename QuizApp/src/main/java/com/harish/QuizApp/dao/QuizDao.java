package com.harish.QuizApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.harish.QuizApp.model.Quiz;


@Repository
public interface QuizDao extends JpaRepository<Quiz,Integer> {

}
