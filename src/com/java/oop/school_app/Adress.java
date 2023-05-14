package com.java.oop.school_app;

import com.java.oop.users.enums.HomeType;

public class Adress {
	public String street;
	public int number;
	public String neighborhood;
	public String city;
	public char state;
	public String country;
	public String zipCode;
	public HomeType homeType;
	
	public Adress(String street, int number, String neighborhood, String city, char state, String country,
			String zipCode, HomeType homeType) {
		this.street = street;
		this.number = number;
		this.neighborhood = neighborhood;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipCode = zipCode;
		this.homeType = homeType;
	}

	public String getStreet() {
		return street;
	}

	public int getNumber() {
		return number;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public String getCity() {
		return city;
	}

	public char getState() {
		return state;
	}

	public String getCountry() {
		return country;
	}

	public String getZipCode() {
		return zipCode;
	}

	public HomeType getHomeType() {
		return homeType;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(char state) {
		this.state = state;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public void setHomeType(HomeType homeType) {
		this.homeType = homeType;
	}

	@Override
	public String toString() {
		return "Adress [street=" + street + ", number=" + number + ", neighborhood=" + neighborhood + ", city=" + city
				+ ", state=" + state + ", country=" + country + ", zipCode=" + zipCode + ", homeType=" + homeType + "]";
	}
	
	public void fullAdress() {
		System.out.println(number + " " + street + ", " + neighborhood + "," + city + " - " + state + " - " + country + " - " + "#" + zipCode);
	}
}
