/*
Program: To understand Ifelse
Author: Shayan Akhtar
Date: 18 oct 2022  
*/
//Importin Packsges
import java.util.*; //util.* - importing all

// Declaring a Class
class IfelseDemo
{
	public static void main(String args[])
	{
		// Creating Scanner Object
		Scanner sc = new Scanner(System.in);
		// Creating Variables
		System.out.println("Enter First Number");
		int num1 = sc.nextInt();
		System.out.println("Enter Second Number");
		int num2 = sc.nextInt();
		
		//Using of If else
			
		if(num1>num2)
			System.out.println("The Greater Number is :"+num1);
		else
			System.out.println("The Greater Number is :"+num2);
		
	}
	//End Of Main
}
//End of Class