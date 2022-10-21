 /*
Program: To Check a Number is Even Or Odd
Author: Shayan Akhtar
Date: 18 oct 2022  
*/
//Importing Packages
import java.util.*; //util.* - importing all

//Declaring a Class
class EvenOddDemo
{
	public static void main(String args[])
	{
		//Creating Scanner Object
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a Number:");
		// Creating Variables
		int num= sc.nextInt();
		
		//Using If else	
		if((num%2)==0)
			System.out.println("The number "+num+" is even");
		else
		   System.out.println("The number "+num+" is odd");
	}
	// end of main
}
// end of class 
