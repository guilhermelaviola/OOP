package com.java.oop.school_app.users;

import com.java.oop.school_app.Adress;
import com.java.oop.users.enums.HomeType;
import com.java.oop.users.enums.UniversityUnit;
import com.java.oop.users.enums.UserType;

public class Test {

	public static void main(String[] args) {
		Adress address = new Adress("Sugar Hill", 43, "Compton", "Los Angeles", "CA", "United States", "8887363", HomeType.HOUSE);
		User user = new User(0, "Andy", "McCall", UserType.STUDENT, null, address, UniversityUnit.LOS_ANGELES);
		
		System.out.println(address);
		System.out.println(user);
	}
	
	
}
