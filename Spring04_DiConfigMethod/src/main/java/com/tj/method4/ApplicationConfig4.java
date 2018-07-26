package com.tj.method4;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:applicationCTX4.xml")
public class ApplicationConfig4 {
	
	@Bean
	public Student student1() {
		ArrayList<String> h = new ArrayList<String>();
		
		h.add("탐정업");
		h.add("미유키 놀리기");
		Student student1 = new Student("김전일", 32, h);
		student1.setHeight(180);
		student1.setWeight(76);
		
		return student1;
	}
	

}
