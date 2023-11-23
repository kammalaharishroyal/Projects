package com.harish.dl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harish.dl.Exceptions.UserNotFoundException;
import com.harish.dl.entity.StudentEntity;
import com.harish.dl.models.StudentEntityResponseModel;
import com.harish.dl.repositorys.StudentEntityRepo;
import com.harish.dl.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentEntityRepo sr;
	

	public StudentEntityResponseModel create(StudentEntity sm) {
		
		StudentEntity s=sr.save(sm);
		StudentEntityResponseModel t=new StudentEntityResponseModel(s.getId(),s.getName(),s.getAge(),s.getEmail(),s.getPhone());
//		s.setName(sm.getName());
//		s.setAge(sm.getAge());
//		s.setPhone(sm.getPhone());
//		s.setCountry(sm.getCountry());
//		s.setEmail(sm.getEmail());
//		s.setCardId(cardrepo.save(new CardEntity()));
		
		return t;
	}

	public StudentEntity updateStudent(StudentEntity s) {
		// TODO Auto-generated method stub
		return sr.save(s);
	}

	public List<StudentEntity> getAll() {
		// TODO Auto-generated method stub
//		List<StudentEntity> ls=sr.findAll();
//		List<StudentEntityResponseModel> sts=ls.stream().map(x->conver(x)).toList();
		return sr.findAll();
	}

	private StudentEntityResponseModel conver(StudentEntity s) {
		// TODO Auto-generated method stub
		StudentEntityResponseModel st=new StudentEntityResponseModel(s.getId(),s.getName(),s.getAge(),s.getEmail(),s.getPhone());
		return st;
	}

	public StudentEntity getById(int id)throws UserNotFoundException {
		if(sr.existsById(id)) {
			return sr.findById(id).get();
		}
		throw new UserNotFoundException("User Not Found with id  "+id);
	}

	public String deleteById(int id) {
		
		if(sr.existsById(id)) {
			sr.deleteById(id);
			return id+" is deleted";
		}
		return "id doesn't exist";
	}

}
