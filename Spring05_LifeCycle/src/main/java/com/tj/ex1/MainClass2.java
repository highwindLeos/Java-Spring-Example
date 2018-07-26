package com.tj.ex1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass2 {

	public static void main(String[] args) {
		
		String loc = "classpath:applicationCTX2.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(loc);

		Student st1 = ctx.getBean("student", Student.class);
		Student st2 = ctx.getBean("student", Student.class);
		
		st1.setAge(100);
		
		System.out.println(st1.toString());
		System.out.println(st2.toString());
		
		if (st1.equals(st2)) {
			System.out.println("st1 과st2 는 같다");
		} else  {
			System.out.println("st1 과st2 는 다르다");
		}
	}

}
