package com.tj.method1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		String[] loc = { "classpath:applicationCTX1.xml", "classpath:applicationCTX2.xml" };

		AbstractApplicationContext ctx = new GenericXmlApplicationContext(loc[0], loc[1]);

		Student student1 = ctx.getBean("student1", Student.class); // 객체의 주소를 가져오는거다.
		StudentInfo studentInfo = ctx.getBean("studentInfo", StudentInfo.class);
		Family family = ctx.getBean("family", Family.class);

		Student student2 = studentInfo.getStudent();

		System.out.println(student1.toString());

		if (student1.equals(student2)) {
			System.out.println("student1 과 student2 는 같다 : " + student2.toString());
		} else {
			System.out.println("student1 과 student2 는 다르다 : " + student2.toString());
		}

		System.out.println(studentInfo.getStudent().toString());
		System.out.println("-------------------------------------");
		Student student3 = ctx.getBean("student3", Student.class);

		if (student1.equals(student3)) {
			System.out.println("student1 과 student3 는 같다 : " + student3.toString());
		} else {
			System.out.println("student1 과 student3 는 다르다 : " + student3.toString());
		}

		studentInfo.setStudent(student3);
		student2 = studentInfo.getStudent();

		if (student2.equals(student3)) {
			System.out.println("student2 과 student3 는 같다 : " + student3.toString());
		} else {
			System.out.println("student2 과 student3 는 다르다 : " + student3.toString());
		}

		System.out.println(student3.toString());
		System.out.println(family.toString());
		System.out.println(family.getPapaName());
		System.out.println(family.getMamiName());
		System.out.println(family.getBrotherName());
		System.out.println(family.getSisterName());

		ctx.close();

	}

}
