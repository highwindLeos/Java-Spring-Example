package com.tj.ex1;

import org.springframework.beans.factory.annotation.Autowired;

public class StudentInfo {
	
	@Autowired
	private Student student;
	
	public StudentInfo() {}

	public StudentInfo(Student student) {
		this.student = student;
	}

	public Student getStudent() {
		return student;
	}
	
	
	
}
