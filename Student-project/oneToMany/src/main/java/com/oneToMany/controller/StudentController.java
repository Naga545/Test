package com.oneToMany.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.oneToMany.beans.Student;
import com.oneToMany.repository.StudentRepository;
import com.oneToMany.repository.StudentSubjectRepository;

@RestController

public class StudentController {

	@Autowired
	private StudentRepository repository;
	@Autowired
	private StudentSubjectRepository repo;

	
	@PostMapping("/save")
	public Student saveDeails(@RequestBody Student student) {
		
		return repository.save(student);
	}
	
	@GetMapping("/getStudentData")
	public List<Student> getDetails(){
		return repository.findAll();
	}

	@GetMapping("/getStudentfindBy")
	public Optional<Student> getDetail(){
		return repository.findById(null);
	}
	/*
	 * @PostMapping("/edit") public Student
	 * updateStudentMarksWithSceince(@RequestParam int id) {
	 * 
	 * Student student=repository.findById(id).get();
	 * student.getStudentSubjects().setMarks("75"); repository.save(student);
	 * 
	 * return student; }
	 */
	
	@PutMapping("/update/{id}")  
	private Student update(@RequestBody Student student)   
	{  
	repository.save(student);  
	return student;  
	} 
	@DeleteMapping("/delete/{id}")  
	private void delete(@PathVariable("id") int id)   
	{  
	repository.deleteById(id);
	
	
	}  
	
}
