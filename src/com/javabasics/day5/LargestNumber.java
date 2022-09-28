package com.javabasics.day5;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first number");
		int num1 = sc.nextInt();
		
		System.out.println("Enter a first number");
		int num2 = sc.nextInt();
		
		System.out.println("Enter a first number");
		int num3 = sc.nextInt();
		
		if((num1>num2) && (num1>num3)) {
			System.out.println("Largest Number is:"+num1);
		}
		
		else if(num2>num3) {
			System.out.println("Largest Number is:"+num2);
		}
		
		else {
			System.out.println("Largest Number is:"+num3);
		}
	}

}
