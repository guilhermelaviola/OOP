package com.java.oop.hr;

public class HumanResources {
	private Employee[] employees;
	private int size;
	private int amount;
	
	public HumanResources(int size) {
		this.size = size;
		employees = new Employee[size];
		amount = 0;
	}
	
	public void add(Employee e) {
		if (amount<size) {
			employees[amount]=e;
			amount++;
		} else {
			System.out.println("Limit reached!");
		}
	}
	
	public int getSize() {
		return size;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public Employee getEmployee(int a) {
		return employees[a];
	}
	
	public void paycheck() {
		for (int i=0; i<amount; i++) {
			System.out.println(employees[i]);
		}
	}
	
	public double paycheckTotal() {
		double sum = 0;
		for (int i = 0; i < amount; i++) {
			sum+=employees[i].getSalary();
		}
		return sum;
	}
}
