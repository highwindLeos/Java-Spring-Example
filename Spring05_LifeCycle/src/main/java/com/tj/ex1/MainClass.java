package com.tj.ex1;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		// Spring 컨테이너 생성만 한다. (매개변수 없음)
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		
		// 스프링 컨테이너 안에 빈 설정 = spring 컨테이너 설정
		ctx.load("classpath:applicationCTX1.xml"); // Bean 생성
		ctx.refresh();
		
		// 스프링 컨테이너 사용
		Student st = ctx.getBean("student", Student.class);
		System.out.println(st.toString());
		
		//  스프링 컨테이너 소멸
		ctx.close();
		System.out.println("프로그램 종료");

	}

}
