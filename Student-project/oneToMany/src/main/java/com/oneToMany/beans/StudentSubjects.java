package com.oneToMany.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_subjects")
public class StudentSubjects {
	
	@Id
	@GeneratedValue
	private int id;
	private String subject;
	private String marks;
	public StudentSubjects() {
		super();
	}
	public StudentSubjects(String subject, String marks) {
		super();
		this.subject = subject;
		this.marks = marks;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getMarks() {
		return marks;
	}
	public void setMarks(String marks) {
		this.marks = marks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	


}
