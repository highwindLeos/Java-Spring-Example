package com.tj.method3;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig3 {

	@Bean
	public Student student2 () {
		ArrayList<String> hobbies = new ArrayList<String>();
		
		hobbies.add("야구");
		
		Student student2 = new Student("이만화", 27, hobbies);
		student2.setHeight(180);
		student2.setWeight(60);
					
		return student2;
	}
	
	@Bean
	public Student student3 () {
		ArrayList<String> hobbies = new ArrayList<String>();
		
		hobbies.add("농구");
		
		Student student3 = new Student("이데이", 34, hobbies);
		student3.setHeight(178);
		student3.setWeight(60);
					
		return student3;
	}
	
	
}
