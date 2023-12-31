package com.harish.questionservice.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.harish.questionservice.model.Question;


@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {
	
	
	 @Query(value = "SELECT q.id FROM question q Where q.category=:category ORDER BY RAND() LIMIT :numQ", nativeQuery = true)
	 List<Integer> findRandomQuestionsByCategory(String category, int numQ);

}
