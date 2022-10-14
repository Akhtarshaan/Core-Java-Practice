/////////////////////////////////////////////////////////

class AdditionDemo
{
	public static void main(String args[])
	{
		float number1= Float.parseFloat(args[0]);
		float number2= Float.parseFloat(args[1]);
		
		/////////////////////////////////////////
		
		float sum = number1+ number2;
		System.out.println("The Sum is :" +sum);
	}
}