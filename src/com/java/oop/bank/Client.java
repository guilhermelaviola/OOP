package com.java.oop.bank;

public class Client {
	public String currentAccount;
	public int agencyNumber;
	public int bankNumber;
	public double balance;
	
	public void withdraw(double value) {
		if (this.balance>=value) {
			this.balance=this.balance-value;
		}
	}
}
