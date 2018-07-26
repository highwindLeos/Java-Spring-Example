package com.tj.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CalculationMainClass {

	public static void main(String[] args) {
		
		/*
		Calculation cal = new Calculation();
		
		cal.setFirstNum(10);
		cal.setSecondNum(2); */
		
		String location = "classpath:applicationCTX.xml";
		// Spring 컨테이너를 생성하고 xml 설정 파일을 파싱하여 객체생성
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(location);
		// 외부 (스프링 컨테이너)의 객체를 주입받아
		Calculation cal = ctx.getBean("calculation", Calculation.class);
		
		cal.add();
		cal.sub();
		cal.mul();
		cal.div();
		
		ctx.close();

	}

}
