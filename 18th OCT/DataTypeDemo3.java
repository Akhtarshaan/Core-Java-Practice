/*
Program: To Understand DataTypeDemo3
Author: Shayan Akhtar
Date: 18th Oct 2022
*/

//Import Packages
import java.util.Scanner;

//Declaring a Class
class DataTypeDemo3
{
	public static void main(String args[])
	{
	  int num1=92;
	  int d= 6;
	  
	  System.out.println("Quotient :"+num1/d);
	  System.out.println("Remainder :"+num1%d); // Mudulas Opreator
	  
	  System.out.println(num1>92);
	  
	//////////////////////////////////////////////////
	
	 int x=6,y=8;
	 System.out.println("And:"+ (x&y)); // Here int is Converted to the Binary Equivalent
	 System.out.println("OR:"+ (x|y));
	 System.out.println("Not:"+ (~x));
	 System.out.println("XOR:"+ (x^y));
	 
	 //Using Left & Right Shift
	
	 System.out.println(20<<3);// Left Shift(20 *(2^3)) 
	 System.out.println(20>>3);// Right Shift(20/ (2^3))
		
	}
	// End of Main
}
// End od Class