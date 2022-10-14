/*
Program: To understand the input using scanner
Author: Shayan akhtar
Date: 14th OCT 2022
*/

//importing utill package for scanner class

import java.util.Scanner;  //

class ScannerDemo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENTER YOUR NAME");
		String name= sc.next(); //String Input
		
		//////////////////////////////////////////////////////////
		
		System.out.println("ENTER YOUR AGE");
		int age= sc.nextInt(); // Integar Input
		
		//////////////////////////////////////////////////////////
		
		System.out.println("ENTER YOUR MARKS");
		float marks= sc.nextFloat(); // Float Input
		
		///////////////////////////////////////////////////////////
		
		System.out.println("PASS(true/false):");
		boolean pass = sc.nextBoolean (); // Boolean Input
		
		///////////////////////////////////////////////////////////
		
		System.out.println("ENTER YOUR GERNDER(M/F):");
		char gender = sc.next().charAt(0); // Character Input
		
		
		////////////////////////////////////////////////////////////
		
		System.out.println("Your Details Are:");
		System.out.println("Name:"+ name);
		System.out.println("Age;"+ age);
		System.out.println("Marks:"+ marks);
		System.out.println("Pass:"+ pass);
		System.out.println("Gender:"+ gender);
		
		//////////////////////////////////////////////////////////////
	}
	
}
		