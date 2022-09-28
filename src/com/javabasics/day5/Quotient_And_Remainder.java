package com.javabasics.day5;

import java.util.Scanner;

public class Quotient_And_Remainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.err.println("Enter a dividend: ");
		int dividend = sc.nextInt();
		
		System.err.println("Enter a divisor: ");
		int divisor = sc.nextInt();

	    int quotient = dividend / divisor;
	    int remainder = dividend % divisor;

	    System.out.println("Quotient = " + quotient);
	    System.out.println("Remainder = " + remainder);
	}

}
