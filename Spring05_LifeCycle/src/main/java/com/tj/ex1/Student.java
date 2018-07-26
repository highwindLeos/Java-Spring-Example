package com.tj.ex1;

import javax.annotation.*;

// Student 형 객체가 생성될 때와 소멸될때 실행될 작업을 할때
// 1. interface 를 이용한 방법
// 2. annotation 을 이용한 방법
public class Student /*implements InitializingBean, DisposableBean*/ {
	
	private String name;
	private int age;
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("Student형 빈이 막 생성되었다.");
	}
	
	@PreDestroy
	public void preDestory() {
		System.out.println("Student형 빈이 막 소멸되었다.");
	}
			
	@Override
	public String toString() {
		return "학생정보 [name=" + name + ", age=" + age + "]";
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	
	/*@Override
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("Studeant형 빈 막 생성했습니다.");
		
	}

	@Override
	public void destroy() throws Exception {
		
		System.out.println("Studeant형 빈 막 소멸했습니다.");
		
	}*/
	
}
