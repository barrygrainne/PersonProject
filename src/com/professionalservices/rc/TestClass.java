package com.professionalservices.rc;

public class TestClass {
	// properties
	protected int x;
	protected int y;
	
	
	

	
	// get & set method
	
	// constructor(s)
	public TestClass(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	// other methods
	@Override
	public String toString() {
		return "XXXTestClass [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]"; // getclass use if you have inherited objects??
	}
	//good idea to add .= to your code, let eclipse write the .= method
	
	@Override
	public int hashCode() { // don't need hashCode in this example, useful for comparison of objects
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	@Override
	public boolean equals(Object obj) { // using this one, the equals to one in this example
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TestClass other = (TestClass) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		TestClass testClass = new TestClass(1,1);
		
		//String s = "text " + testClass;
		String s = "text " + testClass.toString(); // convert to string
												//toString is coming from object class, 
												//every single object in java has access to, but we can supply our
												//own method of the toString method. (give visual representation of 
												// properties in your class
		
		System.out.println(s);
		TestClass o1 = new TestClass(1,1);
		TestClass o2 = o1;
		//TestClass o2 = new TestClass(1,1);
		
		if(o1.equals(o2)){ // from now one we will never use == to compare two objects, will use . = instead
			System.out.println("the same");
		} else {
			System.out.println("different");
		}
		
		String s1 = new String("Grainne");
		String s2 = new String("Grainne");
		
		if(s1 == s2) { // do not do == comparison on objects
			System.out.println("Strings are the same");
			} else { 
				System.out.println("Strings are different");
				}
		
		if(s1.equals(s2)) {
			System.out.println("Strings are the same");
			} else { 
				System.out.println("Strings are different");
				}
		
		// TestClass o3;
		// try{
		//o3 = (TestClass) o1.clone}
		//TestClass o3 = (TestClass) o1.clone();
		
		//System.out.println(o3);
	}
	
	

	

}
