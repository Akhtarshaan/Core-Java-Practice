class DataTypeDemo2
{
	public static void main(String args[])
	{
		
		//num1++  //post increment : value is used and then incremented
		
		int num1= 49;
		int sum= num1++;
		System.out.println("Value of sum using num1++ :"+ sum);
		
		
		//++num1 // pre increment : value is incremented and then used
		
		int num2= 67;
		sum= ++num2;
		System.out.println("Value of sum using ++num2 :"+ sum);
		
		
		////////////////////////////////////////////////////////////////////////
		
		
		int x=1;
		System.out.println("Not x :"+ ~x);
		
		boolean status = true;
		System.out.println("!Status : "+ !status);
	}
}