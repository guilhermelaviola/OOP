package com.java.oop.inheritance.car;

public class Engine {

	private double capacity;
	private boolean on;
	
	public Engine(double capacity) {
		this.capacity = capacity;
		this.on = false;
	}

	public double getCapacity() {
		return capacity;
	}

	public boolean isOn() {
		return on;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public void setOn(boolean on) {
		this.on = on;
	}
	
	public void turnOn() {
		if (this.on) {
			System.out.println("The car is off.");
		}else {
			this.on = true;
			System.out.println("The car is on.");
		}
	}
	
	public void turnOff() {
		this.on = false;
	}

	@Override
	public String toString() {
		return "Engine [capacity=" + capacity + ", on=" + on + ", getCapacity()=" + getCapacity() + ", isOn()=" + isOn()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}
