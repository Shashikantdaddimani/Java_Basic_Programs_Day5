package com.javabasics.day5;

public class SwapNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 float first = 1.20f, second = 2.45f;

	        System.out.println("--Before swap--");
	        System.out.println("First number = " + first);
	        System.out.println("Second number = " + second);

	        
	        float temporary = first;	// Value of first is assigned to temporary

	      
	        first = second;			 // Value of second is assigned to first

	      
	        second = temporary;			 // Value of temporary (which contains the initial value of first) is assigned to second

	        System.out.println("--After swap--");
	        System.out.println("First number = " + first);
	        System.out.println("Second number = " + second);
	}

}
