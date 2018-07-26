package com.tj.ex1;

import java.io.IOException;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;

public class MainClass {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext();
		
		ConfigurableEnvironment env = ctx.getEnvironment();
		
		MutablePropertySources propertySources =  env.getPropertySources();
		
		try {
			propertySources.addLast(new ResourcePropertySource("classpath:admin.properties"));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("adminId : " + env.getProperty("admin.id"));
		System.out.println("adminPw : " + env.getProperty("admin.pw"));
		
		ctx.close();
	}

}
