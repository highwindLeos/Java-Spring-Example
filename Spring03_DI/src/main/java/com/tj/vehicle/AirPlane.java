package com.tj.vehicle;

public class AirPlane implements Vehicle {

	@Override
	public void ride(String name) {
		System.out.println(name + "은(는) 비행기를 500km/h로 날아간다.");
	}

}
