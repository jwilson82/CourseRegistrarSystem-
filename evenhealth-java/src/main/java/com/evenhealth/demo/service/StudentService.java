package com.evenhealth.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evenhealth.demo.model.student;
import com.evenhealth.demo.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository sr;
	
	public void createNewStudent(student newStudent) {
		System.out.println("Student Service Hit");
		sr.save(newStudent);
	}

	public void deleteStudent(int id) {
		sr.deleteById(id);
	}

}
