package com.javabasics.day5;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter a year: ");
		int year = s.nextInt();
		
		if((year%400==0) && (year%4==0)){
			System.out.println("is a leap year: "+year);
		}else if(year%100==0){
			
			System.out.println("is not a leaf year: "+year);
		
		}else {
			System.out.println("is not a leaf year");
		
		
		}
	}

}
