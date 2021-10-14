package org.renova.model.service;

import java.util.List;

import javax.transaction.Transactional;

import org.renova.model.entity.Student;
import org.renova.model.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentService {
	
	
	@Autowired 
	private StudentRepository studentRepository;
	
	@Transactional
	public List<Student> findAll() {
		return (List<Student>) StudentRepository.findAll();
	}
	
	@Transactional
	public List<Student> findBySurname(String surname) {
		return StudentRepository.findBySoyad(soyad);
	}
	
	
	
}




