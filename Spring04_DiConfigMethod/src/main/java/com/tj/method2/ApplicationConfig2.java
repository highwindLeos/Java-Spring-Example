package com.tj.method2;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig2 {

	@Bean
	public Student student3() {
		ArrayList<String> hobbies = new ArrayList<String>();
		
		hobbies.add("당구");
		
		Student student3 = new Student("이만화", 30, hobbies);
		student3.setHeight(170);
		student3.setWeight(53);
		
		return student3;
	}
}
