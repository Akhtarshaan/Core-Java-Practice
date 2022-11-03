 /*
Program: Demo class to test package.
Author: Shayan Akhtar
Date: 25th Oct 2022  
*/

//declaring a package
package com.demoloop2;

//importing a package
import com.demoloop.*;

public class Test2 {
	
	    //main method
		public static void main(String[] args) {
			
		//creating a object of Demo class	
		Demo object = new Demo();
		
		//calling the method
		//all method should be public 
		object.printValue();
		
		//calling static directly with name of class - No object required
		Demo.printMessage();

		}
		//end of main method
}
//end of class
