package com.java.oop.brand;

// Encapsulation and Inheritance
public class Coke implements Brand {

	public int yearOfFoundation = 1892;
	
	// Encapsulation and Polymorphism
	@Override
	public void slogan() {
		System.out.println("Taste the Feeling!");
	}

	// Encapsulation and Polymorphism
	@Override
	public void whereFrom() {
		System.out.println("Coca-Cola is from USA.");
	}

	// Encapsulation and Polymorphism
	@Override
	public void activeSince() {
		System.out.println("Coca-Cola has been active since " + yearOfFoundation);
	}
}
