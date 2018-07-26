package com.tj.method2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class MainClass {

	public static void main(String[] args) {

//		AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		AbstractApplicationContext ctx = new AnnotationConfigApplicationContext("com.tj.method2"); // 해당 패키지에 있는 자바파일을 모두 파싱한다.
		Student student1 = ctx.getBean("student1", Student.class);
		Student student2 = ctx.getBean("student2", Student.class);
		Student student3 = ctx.getBean("student3", Student.class);
		
		System.out.println(student1.toString());
		System.out.println(student2.toString());
		System.out.println(student3.toString());
		
		ctx.close();
	}

}
