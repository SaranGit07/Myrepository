package com.test;

import java.util.Scanner;

public class Scannerclass {

	public static void main(String[] args) {
		
		Scanner ob= new Scanner(System.in);
		
		Float a,b;
		String name;
		
		
		System.out.println("enter the name:");
		name=ob.next();
		
		
		
		System.out.println("Enter the value of a:");
		a=ob.nextFloat();
		System.out.println("Enter the value of b:");
		b=ob.nextFloat();
		
		System.out.println("subraction of values:"+(a-b));
		ob.close();
		
	}

}
