package com.java.oop.inheritance.car;

public class Main {
	
	public static void main(String[] args) {
		Sedan car1 = new Sedan("Taurus", "Ford", 1.8);
		Car car2 = new Car(2.0, "Volkswagen");
		
		car1.turnOn();
		car1.turnOn();
		car2.turnOn();
		car2.turnOn();
		
		System.out.println(car1.getEngine());
		System.out.println(car1);		
	}
}
