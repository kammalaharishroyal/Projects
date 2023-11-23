package com.harish.studentmanage.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.harish.studentmanage.entity.Student;


@Repository
public interface StudentDao extends JpaRepository<Student,Integer> {

}
