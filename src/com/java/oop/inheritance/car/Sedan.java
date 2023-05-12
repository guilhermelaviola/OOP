package com.java.oop.inheritance.car;

public class Sedan extends Car {

	String model;
	
	public Sedan(String model, String brand, double capacity) {
		super(capacity, brand);
		this.model = model;
	}
	
	public void turnOn() {
		if (getEngine().isOn()) {
			System.out.println("The motor is on.");
		} else {
			super.turnOn();
		}
	}

	@Override
	public String toString() {
		String s = "The model is " + model + "\n";
		s += super.toString();
		return s;
	}
	
	
}
