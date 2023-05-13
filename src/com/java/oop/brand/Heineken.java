package com.java.oop.brand;

//Encapsulation and Inheritance
public class Heineken implements Brand {

	public int yearOfFoundation = 1864;
	
	// Encapsulation and Polymorphism
	@Override
	public void slogan() {
		System.out.println("The best beer is brewed in a better world!");
	}

	// Encapsulation and Polymorphism
	@Override
	public void whereFrom() {
		System.out.println("Heineken is from Netherlands.");
	}

	// Encapsulation and Polymorphism
	@Override
	public void activeSince() {
		System.out.println("Heineken has been active since " + yearOfFoundation);
	}
}
