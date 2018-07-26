package com.tj.student;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		String location = "classpath:applicationCTX.xml";
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(location);
		
		Student student1 = ctx.getBean("student1", Student.class);
		Student student2 = ctx.getBean("student2", Student.class);
		
		StudentInfo si = ctx.getBean("studentInfo", StudentInfo.class);
		
		si.getStudentInfo();
	
		if (si.getStudent().equals(student1)) {
			System.out.println("s1의 student변수는 student1 을 참조한다.");
		} else {
			System.out.println("s1의 student변수는 student1 을 참조 하지 않는다.");
		}
		
		System.out.println("---s1 student 변경후---");
		
		si.setStudent(student2);
		si.getStudentInfo();
		
		if (si.getStudent().equals(student2)) {
			System.out.println("s1의 student변수는 student1 을 참조한다.");
		} else {
			System.out.println("s1의 student변수는 student1 을 참조 하지 않는다.");
		}
		
		ctx.close();
		
	}
	
}
