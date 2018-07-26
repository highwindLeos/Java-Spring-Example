package com.tj.pencli;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		String loc = "classpath:applicationCTX2.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(loc);
		Pencli pencli = ctx.getBean("pencil", Pencli.class);
		
		pencli.use();
		
		ctx.close();
	}

}
