package com.tj.ex1;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass3 {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX3.xml");
		
		StudentInfo si = ctx.getBean("studentInfo", StudentInfo.class);
		
		System.out.println(si.getStudent().toString());
		
		ctx.close();

	}

}
