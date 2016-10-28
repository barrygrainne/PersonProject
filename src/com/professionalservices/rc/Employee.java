package com.professionalservices.rc;

public class Employee extends Person {
	
	// properties
	private double salary;
	
	// get & set Methods

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	// constructor (s)
	


	public Employee(String firstName, String lastName, double salary) { // calling the base class constructor with these two elements
		super(firstName, lastName); // super must be first call in constructor, can't put something before this
		this.salary = salary;
		

	}

	// other methods
	public void display() {
		System.out.println("Employee Object");
		super.display(); // this calls the person display() method
		//System.out.println(getFirstName() + " " + getLastName());
		System.out.println(salary);
		
		//System.out.println(firstName + " " + getLastName());
		
		
		
	}
	// main - use for test
	public static void main(String[] args) {
	
		
		Employee employee = new Employee("Grainne", "Barry", 30000);
		
		employee.display();
	}

}
