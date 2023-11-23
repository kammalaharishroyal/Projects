package com.harish.studentmanage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.harish.studentmanage.dao.StudentDao;
import com.harish.studentmanage.entity.Student;

@Component
public class StudentService {
	
	@Autowired
	StudentDao studentdao;

	public ResponseEntity<String> addStudent(Student s) {
		
		studentdao.save(s);
		System.out.println(s);
		return new ResponseEntity<>("success",HttpStatusCode.valueOf(200));
	}

	

	public ResponseEntity<List<Student>> getAllStudents() {
		List<Student> ls=studentdao.findAll();
		
		return new ResponseEntity<>(ls,HttpStatusCode.valueOf(400));
	}



	public ResponseEntity<String> deleteStudent(int id) {
		Student s;
		
		try {
		 s=studentdao.getById(id);
		 studentdao.deleteById(id);
		 return new ResponseEntity<>("id:"+s.getId()+"\nName:"+s.getName()+"\n deleted successful",HttpStatusCode.valueOf(400));
		}
		catch(Exception e) {
			 s=null;
			 
		}
		return new ResponseEntity<String>("no id found",HttpStatusCode.valueOf(300));
		
	}


	

}
