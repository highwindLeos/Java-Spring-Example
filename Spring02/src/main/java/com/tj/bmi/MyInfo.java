package com.tj.bmi;

import java.util.ArrayList;

public class MyInfo {

	private String name;
	private double height;
	private double weight;
	
	private ArrayList<String> hobbies;
	
	private BMICalculator bmiCalculator;
	
	public void getInfo() { // 해당 정보를 출력
		
		System.out.println("이름 : " + name);
		System.out.println("키 : " + height);
		System.out.println("체중 : " + weight);
		System.out.println("취미 : " + hobbies); // [a,b,c]
		
		bmiCalculator.bmiCalculator(weight, height); // bmi 지수 상태 출력
		
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setHobbies(ArrayList<String> hobbies) {
		this.hobbies = hobbies;
	}

	public void setBmiCalculator(BMICalculator bmiCalculator) {
		this.bmiCalculator = bmiCalculator;
	}
	
}
