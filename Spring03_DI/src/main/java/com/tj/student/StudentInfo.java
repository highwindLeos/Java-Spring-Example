package com.tj.student;

public class StudentInfo {
	private Student student;
	
	public StudentInfo (Student student) {
		this.student = student;
	}
	
	public void getStudentInfo() {
		if (student != null) {
			student.toString();
			System.out.println("이름 : " + student.getName());
			System.out.println("나이 : " + student.getAge());
			System.out.println("학년 : " + student.getGradeNum());
			System.out.println("반 : " + student.getClassNum());
		} else {
			System.out.println("의존객체가 지정되지 않았습니다.");
		}
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}
