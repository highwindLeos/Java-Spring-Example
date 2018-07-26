package com.tj.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		/*MyCalculator mycal = new MyCalculator();
		mycal.setCalculator(new Calculator());
		
		mycal.setFirstNum(10);
		mycal.setSecondNum(2);*/
		String location = "classpath:applicationCTX.xml";
		// 컨테이너 생성 하고 bean 생성하기
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(location);
		// 생성된 bean 주입받아
		MyCalculator myCal = ctx.getBean("myCal", MyCalculator.class);
		// bean 사용
		myCal.add();
		myCal.sub();
		myCal.mul();
		myCal.div();
		// bean 컨테이너 소멸
		ctx.close();

	}

}
