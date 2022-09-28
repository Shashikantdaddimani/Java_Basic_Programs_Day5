package com.javabasics.day5;

import java.util.*;

public class FlipCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter The number");
		Scanner sc = new Scanner(System.in);
		int flip = sc.nextInt();
		int heads = 0;
		int tails = 0;
		int count = 0;
		double random = 0.0;
	
		while(count <= flip) {
			random=Math.random();
			System.out.println(count+" " +random);
			
			if(random<0.5) {
				heads++;
				System.out.println("head");
			}
			else 
			{
				tails++;
				System.out.println("Tails");
			}
			count++;
		}
		System.out.println();	
		System.out.println("Number of Heads:"+heads);	
		System.out.println("Number of tails:"+tails);	
			
		double headpercent = (double) heads/flip*100;
		double tailpercent = (double) tails/flip*100;
		
		
		System.out.println("percentage of heads:"+headpercent);
		System.out.println("percentage of tails:"+tailpercent);
		}
	}


