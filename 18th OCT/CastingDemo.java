 /*
Program: To Understand TypeCasting
Author: Shayan Akhtar
Date: 18 oct 2022  
*/
//Import Packages 
import java.util.Scanner;
//Declaring a Class
class CastingDemo
{
	public static void main(String args[])
	{
        //Declaring Short Data Type
		//Short is of 2 bytes  -32768 to 32767
		short s1= 56;
		short s2= 89;
		
		//Calculating The Sum
		short sum;
		sum= (short)(s1+s2); // ( NOTE - By Default All The Arithmetic Operation Gives Integar Output )
		
		System.out.println("The Sum is :"+sum);	//Printing Sum
		
		//Declaring Byte Data Type
		//Byte -128 to 127 
		byte b1= 67;
		byte b2 =45;
		
         byte cal= (byte)(b1+b2);
		System.out.println("The Calc is :"+cal); //Printing The Sum
		
		//Declaring Double Data Type
		double d1= 89.5;
		double d2= 67.4;
		float dd= (float)(d1+d2);
		System.out.println("The dd is :"+dd); //Printing The Sum
		
		// Type Casting Omit
		
		byte b3=8;
		byte b4=9;
		//b3= (byte)(b3+b4);
		
		b3+=b4; // Auto Type Casting b3 = b3+b4
		System.out.println("The b3  :"+b3);	
	}
	// End of Main
}
// End of Class 
