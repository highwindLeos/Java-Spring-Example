package com.tj.method3;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
		String loc = "classpath:applicationCTX3.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(loc);
		
		Student st1 = ctx.getBean("student1", Student.class);
		Student st2 = ctx.getBean("student2", Student.class);
		Student st3 = ctx.getBean("student3", Student.class);
		
		System.out.println(st1.toString());
		System.out.println(st2.toString());
		System.out.println(st3.toString());

		ctx.close();
		
	}
}
