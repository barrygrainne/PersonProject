package com.professionalservices.rc;

public class Contractor extends Person {
	
	// properties
	private double dailyRate;
	// get & set methods
	public double getDailyRate() {
		return dailyRate;
	}

	public void setDailyRate(double dailyRate) {
		this.dailyRate = dailyRate;
	}
	// constructor(s)
	

	public Contractor(String firstName, String lastName, double dailyRate) {
		super(firstName, lastName);
		this.dailyRate = dailyRate;
	}
// other methods
	public void display(){
		System.out.println("Contractor Object");
		super.display(); // this calls the person display() method
	
		System.out.println(dailyRate);
	
		
		
	}
	
	
// main
	public static void main(String[] args) {
	
		Contractor contractor = new Contractor ("Grainne", "McCarthy", 400);
		
		contractor.display();
		
		//Contractor[] list = new Contractor[10];
		//list[0] = new Contractor("Barney", "Rubble", 100);
		
	}

	
}
