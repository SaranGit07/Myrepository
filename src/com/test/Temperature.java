package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Temperature {
	
	public static void main (String[] args) throws NumberFormatException,IOException {
		 Double f,c;
		 
		 BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
		 
		 System.out.println("Enter the centigrade value:");
		 c=Double.parseDouble(ob.readLine());
		 
		 f=(9*c)/5+32;
		 
				 
		System.out.println("Enter the fahrenhit value:"+f);		 

}
}