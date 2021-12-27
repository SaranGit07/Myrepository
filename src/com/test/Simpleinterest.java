package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Simpleinterest {

	public static void main(String[] args) throws NumberFormatException,IOException{
		
		Double p,r,t,i;
		
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader ob=new BufferedReader(in);
		
		System.out.println("Enter the principal of amount:");
		p=Double.parseDouble(ob.readLine());
		
		System.out.println("Enter the rate of interest:");
		r=Double.parseDouble(ob.readLine());
		
		System.out.println("Enter the time amount:");
		t=Double.parseDouble(ob.readLine());
		
		i=(p*t*r)/100;
		
		System.out.println("interest amount:"+i);
		

	}

}
