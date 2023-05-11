package com.java.oop.inheritance.car;

public class Car {
	
	private Engine engine;
	private String brand;
	
	public Car(Engine engine, String brand) {
		this.engine = engine;
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
		return "Car [engine=" + engine + ", brand=" + brand + ", getEngine()=" + getEngine() + ", getBrand()="
				+ getBrand() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}
