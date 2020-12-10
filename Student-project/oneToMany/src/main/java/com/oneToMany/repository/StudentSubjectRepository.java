package com.oneToMany.repository;

import org.springframework.data.repository.CrudRepository;

import com.oneToMany.beans.StudentSubjects;

public interface StudentSubjectRepository extends CrudRepository<StudentSubjects, Integer> {

}
