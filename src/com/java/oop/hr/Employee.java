package com.java.oop.hr;

public class Employee {
	private int id;
	private String name;
	private int department;
	private double salary;
	private String function;
	
	public Employee(int id, String name, int department, double salary, String function) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.function = function;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getDepartment() {
		return department;
	}

	public double getSalary() {
		return salary;
	}

	public String getFunction() {
		return function;
	}

	@Override
	public String toString() {
		return name + " $" + salary + "\n";
	}
}
