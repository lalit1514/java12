package com.capgemini;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter value for a:");
		
		int a=sc.nextInt();
		
	System.out.println("Enter value for b:");
		
		int b=sc.nextInt();
		
		System.out.println("Before Swapping\nA value is:"+a+"\nB value is:"+b);
		
		int c;
		
		c=a;
		a=b;
		b=c;
		System.out.println("After Swapping\nA value is:"+a+"\nB value is:"+b);
		
	}	

}
