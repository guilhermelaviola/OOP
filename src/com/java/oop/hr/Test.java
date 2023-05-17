package com.java.oop.hr;

public class Test {
	public static void main(String[] args) {
		HumanResources hr = new HumanResources(10);
		Employee e1 = new Employee(331, "Kevin", 3, 1800, "Junior Programmer");
		Employee e2 = new Employee(332, "Marcus", 3, 2600, "IT Manager");
		Employee e3 = new Employee(333, "Mariah", 2, 1900, "Operations");
		
		hr.add(e1);
		hr.add(e2);
		hr.add(e3);
		
		hr.paycheck();
		System.out.println("Total amount is $ " + hr.paycheckTotal());
		System.out.println(hr.mostExpensiveName() + " has the highest salary.");
		System.out.println("The employee with the highest salary is " + hr.getEmployee(hr.mostExpensivePosition()).getName());
		hr.employeeFunction("Operations");
	}
}
