package com.professionalservices.rc;

public class ExceptionTest {

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
		
	} catch (Exception ex) {
		System.out.println("something happened, oh dear");
	}
		System.out.println("Program fininshed normally");
		

		
	}

}
