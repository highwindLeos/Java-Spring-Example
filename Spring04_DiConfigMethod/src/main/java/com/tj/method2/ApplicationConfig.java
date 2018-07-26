package com.tj.method2;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
// 이 파일은 Spring Bean 설정 파일입니다.
@Configuration
public class ApplicationConfig {
	@Bean
	public Student student1() {
		ArrayList<String> hobbies = new ArrayList<String>();
		hobbies.add("공기놀이");
		hobbies.add("태권도");
		
		Student st1 = new Student("이데이", 36, hobbies);
		st1.setHeight(173);
		st1.setWeight(76);
		
		return st1;
	}
	
	@Bean
	public Student student2() {
		ArrayList<String> hobbies = new ArrayList<String>();
		hobbies.add("영화");
		hobbies.add("독서");
		
		Student student2 = new Student("이유리", 29, hobbies);
		student2.setHeight(167);
		student2.setWeight(50);
		
		return student2;
	}
}
