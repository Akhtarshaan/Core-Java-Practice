/*
Program: Addition with the help of scanner
Author: Shayan akhtar
Date: 14th OCT 2022
*/

import java.util.Scanner;

class AdditionWithScanner
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENTER Number1");
		int number1= sc.nextInt();
		
		System.out.println("ENTER Number2");
		int number2= sc.nextInt();
		
		/////////////////////////////////////////
		
		int sum = number1+ number2;
		System.out.println("The Sum is :" +sum);
	}
}