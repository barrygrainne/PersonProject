package com.professionalservices.rc;

public class ExceptionTest2 {

	public static void main(String[] args) {
		try{
		int r = (int)(Math.random() * 3);
		
		if (r==0) {
			String string = null; // null exception error when run this
			System.out.println(string.toUpperCase());
	
		}
		
		if (r==1) {
			int[] list = {1,2,3,4,5};
			
			for (int i=1; i<=5; i++) {
				System.out.println(list[i]);
			}
		}
		
		
		if (r==2) {
		int x = 10;
		int y = 0;
		
		int answer = x / y; // divide by 0 (y = 0). error when run this
		
		System.out.println(answer);
		}
		
	} catch (ArrayIndexOutOfBoundsException ex) {
		System.out.println("something wrong with array");
		//ex.printStackTrace();
		StackTraceElement[] stackTraceElements = ex.getStackTrace();
		for (StackTraceElement e : stackTraceElements) {
			System.out.println("Line number:" + e.getLineNumber());
		}
	} catch (ArithmeticException ex) {
		System.out.println("something wrong with the maths");
	} catch (NullPointerException ex) {
		System.out.println("you have a null pointer");
	} catch (Exception ex) {
		System.out.println("something happened, oh dear");
	}
		System.out.println("Program fininshed normally");
		
		
		try {
			Thread.sleep(5000); // creating a delay in the word finished appearing on the screen i.e. console
		} catch (InterruptedException e) {
		
			// do nothing - if take out code e.printStackTrace();
			//e.printStackTrace(); // print out stack trace red message in console
		}
		
		System.out.println("finished");
		
	}

}
