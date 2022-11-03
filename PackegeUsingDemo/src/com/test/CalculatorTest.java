/*
Program: Demo class to using package
Author: Shayan Akhtar
Date: 25th Oct 2022  
*/

//declaring package
package com.test;

//importing scanner
import java.util.Scanner;

//imporing calculator package
import com.demo.CalculatorPackage;

public class CalculatorTest {
	
	//creating menu
	static void menu() {
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Exit");
		System.out.println("Enter choice :");

	}

	public static void main(String[] args) {
		
		//taking input choice
		Scanner sc = new Scanner(System.in);
		int choice;

		float number1, number2, result = 0.0f;

		
			System.out.println("Enter first number:");
			number1 = sc.nextFloat();

			System.out.println("Enter second number:");
			number2 = sc.nextFloat();

			menu();

			choice = sc.nextInt();

			switch (choice) {

			case 1:
				result = CalculatorPackage.addition(number1, number2);
				break;
			case 2:
				result = CalculatorPackage.subtraction(number1, number2);
				break;
			case 3:
				result = CalculatorPackage.multiplication(number1, number2);
				break;
			case 4:
				result = CalculatorPackage.division(number1, number2);
				break;
			case 5:
				System.exit(0);
			default:
				System.out.println("Invalid input.........");
			}
		
			System.out.println("The Result is:" + result);	
	}
	//end of main
}
//end of class
