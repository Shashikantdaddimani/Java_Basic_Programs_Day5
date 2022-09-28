package com.javabasics.day5;

import java.util.Scanner;

public class Harmonic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a number ::");
	    int number = sc.nextInt();
	    
	    float harmonic = 1;
	    for (int i = 2; i <= number; i++) {
	        harmonic += (float)1 / i;
	    }
	    
	    System.out.println(harmonic);
	}

}
