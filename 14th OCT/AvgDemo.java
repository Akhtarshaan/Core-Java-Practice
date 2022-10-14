import java.util.Scanner;

class AvgDemo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENTER Number1");
		float number1= sc.nextFloat(); // Taking Input in Float
		
		System.out.println("ENTER Number2");
		float number2= sc.nextFloat(); // Taking Input in Float
		
		System.out.println("ENTER Number3");
		float number3= sc.nextFloat(); // Taking Input in Float
		
		
		//////////////////////////////////////////////////////////////////////
		
		
		float sum = number1+ number2+ number3; // sum of numbers
		System.out.println("The Average of Given Three Number is :" +sum/3); // deviding sum with 3 to find the AVG
		
	}
}
