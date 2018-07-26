package com.tj.vehicle;

public class Car implements Vehicle {

	@Override
	public void ride(String name) {
		System.out.println( name + "은(는) 자동차를 70Km/h 로 탄다");
	}

}
