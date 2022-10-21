/*
Program: To Understand Data Types (Charvalue-Asciivalue)
Author: Shayan Akhtar
Date: 18 oct 2022  
*/

import java.util.Scanner;
class DataTypeDemo
{
	public static void main(String args[])
	{
	
	
		// Creating Scanner Object
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character:");
	
		// Takin a character input
		char charValue = sc.next().charAt(0);
	
		// Converting char into asciivalue
		int asciivalue= charValue;
	
		// Print asciivalue
		System.out.println("The Ascii Value Of "+ charValue + "is: "+asciivalue);
	}
}


	