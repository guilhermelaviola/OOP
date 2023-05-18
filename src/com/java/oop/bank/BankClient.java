package com.java.oop.bank;

public class BankClient extends Client{
	public String idNumber;
	public String name;
	
	public void takeLoan(double value) {
		balance = balance+value;
	}
}
