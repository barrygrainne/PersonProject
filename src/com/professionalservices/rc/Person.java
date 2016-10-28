package com.professionalservices.rc; // package is a group of classes, can move things from one package
									// to another by modifying this line

public class Person { // always have capital letter for name of class

	// properties - all member variables should be private
	protected String firstName;
	protected String lastName;
	
	// get & set methods
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	// constructor (s) -  auto generate constructor 
	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	// other methods
	public void display() {
		System.out.println("Person object");
		System.out.println(firstName + " " + lastName);
	}
	// main

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person = new Person("Grainne", "Barry");
		
		person.display(); // calling the display
		
		//person.firstName = "Fred";  cannot do this
		//person.display();
		
	}
	
	

	

}
