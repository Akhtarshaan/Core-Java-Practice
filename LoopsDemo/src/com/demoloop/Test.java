 /*
Program: Demo class to test package.
Author: Shayan Akhtar
Date: 25th Oct 2022  
*/

//declaring a package
package com.demoloop;

//declaring a class to test package demo
public class Test {

	//main method
	public static void main(String[] args) {
		
	//creating a object of Demo class	
	Demo object = new Demo();
	
	//calling the method
	object.printValue();
	
	//calling static directly with name of class: no object required
	Demo.printMessage();
	
	}
	//end of main method
}
//end of class
