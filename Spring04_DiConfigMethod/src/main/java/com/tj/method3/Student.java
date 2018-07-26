package com.tj.method3;

import java.util.ArrayList;

public class Student {
	
		private String name;
		private int age;
		private ArrayList<String> hobbies;
		private double height;
		private double weight;
		
		public Student(String name, int age, ArrayList<String> hobbies) {
			this.name = name;
			this.age = age;
			this.hobbies = hobbies;
		}
		
		@Override
		public String toString() {
			return "학생정보 [name=" + name + ", age=" + age + ", hobbies=" + hobbies + ", height=" + height
					+ ", weight=" + weight + "]";
		}

		public double getHeight() {
			return height;
		}

		public void setHeight(double height) {
			this.height = height;
		}

		public double getWeight() {
			return weight;
		}

		public void setWeight(double weight) {
			this.weight = weight;
		}

		public String getName() {
			return name;
		}

		public int getAge() {
			return age;
		}

		public ArrayList<String> getHobbies() {
			return hobbies;
		}
		
}
