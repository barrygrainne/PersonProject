package com.professionalservices.rc;

public class Manager extends Employee { // inherits from Employee
	
	// properties
	protected int directReports;
	// get & set Method
	public int getDirectReports() {
		return directReports;
	}

	public void setDirectReports(int directReports) {
		getLastName();
		
		this.directReports = directReports; // 1st direct reports referring to the property direct reports. 
											//2nd relates to variable
											// use where the variable has same name as property or
											// to get at telesense type this. to see names
	}
	// constructor (s)
	
	
	
	
	

	//each display is calling super from the previous one

	public Manager(String firstName, String lastName, double salary, int directReports) {
		super(firstName, lastName, salary);
		this.directReports = directReports;
		// this 
	}
	
	// other methods
	public void display() {
		System.out.println("Manager Object");
		super.display(); // this calls the person display() method
		System.out.println("Direct Reports:" + directReports);
		System.out.println();
	}
	
	//main - for testing
	public static void main(String[] args) {
			
			Manager manager = new Manager("Mary", "Brown", 40000, 10);
			manager.display();
			
			Contractor contractor = new Contractor("Linda", "Murphy", 250);
			contractor.display();
			
			Employee employee = new Employee("Barney", "Rubble", 30000);
			//employee.display();
			
			Person[] personList = new Person[3];
			personList[0] = manager;
			personList[1] = contractor;
			personList[2] = employee;
			
			for (int i=0; i<personList.length; i++) {
				personList[i].display(); // access item no i, this is older way to do this
			} // end of for loop
			
			for (Person p : personList) { // all person objects (p) in person list, this is the newer way to do loop
				p.display(); // call p // for each object in the collection of objects call this method
			}
			
			int [] list = {1,2,3,4,5}; // works with a list of integers as well as objects
			for (int i:list) { 
				System.out.println(i);
				
			}
		}
	

}

