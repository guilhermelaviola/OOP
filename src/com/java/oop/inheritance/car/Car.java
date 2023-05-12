package com.java.oop.inheritance.car;

public class Car {
	
	private Engine engine;
	private String brand;
	
	public Car(double capacity, String brand) {
		this.engine = new Engine(capacity);
		this.brand = brand;
	}
	
	public void turnOn() {
		engine.turnOn();
	}

	public Engine getEngine() {
		return engine;
	}

	public String getBrand() {
		return brand;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void turnOff() {
		engine.turnOff();
	}

	@Override
	public String toString() {
		String s = "The car brand is " + this.brand + "\n" + engine;
		return s;
	}
}
