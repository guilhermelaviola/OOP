package com.java.oop.school_app.users;

import java.sql.Date;
import java.util.UUID;

import com.java.oop.school_app.Adress;
import com.java.oop.users.enums.UniversityUnit;
import com.java.oop.users.enums.UserType;

// Abstraction
public class User {

	// Encapsulation
	public int id;
	public String firstName;
	public String lastName;
	public UserType userType;
	public Date memberSince;
	public Adress adress;
	public UniversityUnit universityUnit;
	
	public User(int id, String firstName, String lastName, UserType userType, Date memberSince, Adress adress,
			UniversityUnit universityUnit) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userType = userType;
		this.memberSince = memberSince;
		this.adress = adress;
		this.universityUnit = universityUnit;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public UserType getUserType() {
		return userType;
	}

	public Date getMemberSince() {
		return memberSince;
	}

	public Adress getAdress() {
		return adress;
	}

	public UniversityUnit getUniversityUnit() {
		return universityUnit;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	public void setMemberSince(Date memberSince) {
		this.memberSince = memberSince;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	public void setUniversityUnit(UniversityUnit universityUnit) {
		this.universityUnit = universityUnit;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", userType=" + userType
				+ ", memberSince=" + memberSince + ", adress=" + adress + ", universityUnit=" + universityUnit + "]";
	}
}
