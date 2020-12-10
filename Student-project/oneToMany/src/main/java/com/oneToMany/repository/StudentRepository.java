package com.oneToMany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oneToMany.beans.Student;
import com.oneToMany.beans.StudentSubjects;

public interface StudentRepository extends JpaRepository<Student,Integer> {

	
	

}
