package com.tj.ex;

public class Calculator {
	
	public void addition(int f, int s) {
		
		System.out.println("더하기");
		int result = f + s;
		System.out.println(f+"+"+s + "=" + result);
		
	}
	
	public void substraction(int f, int s) {
			
			System.out.println("빼기");
			int result = f - s;
			System.out.println(f+"-"+s + "=" + result);
			
		}
	
	public void multiplytion(int f, int s) {
		
		System.out.println("곱하기");
		int result = f * s;
		System.out.println(f+"*"+s + "=" + result);
		
	}
	
	public void divition(int f, int s) {
		
		System.out.println("나누기");
		int result = f / s;
		System.out.println(f+"/"+s + "=" + result);
		
	}

}
