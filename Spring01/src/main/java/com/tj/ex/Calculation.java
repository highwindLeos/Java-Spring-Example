package com.tj.ex;

public class Calculation {

	private int firstNum;
	private int secondNum;
	
	public void add() {
		int result = firstNum + secondNum;
		System.out.println("더하기 : ");
		System.out.println(firstNum + "+" + secondNum + "=" + result);
	}
	
	public void sub() {
		int result = firstNum - secondNum;
		System.out.println("빼기 : ");
		System.out.println(firstNum + "-" + secondNum + "=" + result);
	}
	
	public void mul() {
		int result = firstNum * secondNum;
		System.out.println("곱하기 : ");
		System.out.println(firstNum + "*" + secondNum + "=" + result);
	}
	
	public void div() {
		int result = firstNum / secondNum;
		System.out.println("나누기 : ");
		System.out.println(firstNum + "/" + secondNum + "=" + result);
	}

	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}

	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}
	
}
