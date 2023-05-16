package com.java.oop.tv;

public class Test {
	
	public static void main(String[] args) {
		Tv tv1 = new Tv();
		tv1.turnTvOn();
		tv1.displayInfo();
		tv1.switchChannelUp();
		tv1.decreaseSound();
		tv1.displayInfo();
		
		Tv tv2 = new Tv();
		tv2.switchChannelDown();
		tv2.decreaseSound();
		tv2.displayInfo();
	}
}
