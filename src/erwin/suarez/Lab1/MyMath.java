//MyMath.java
/*This is a class with user defined methods*/
package erwin.suarez.Lab1;

public class MyMath{
	
	private static int num1,num2,num3, biggest;	
	private static double result;
	private String pass;
	
	//biggest number method 
	public static int biggestNumber(int num1, int num2, int num3)
	{	
		if(num1 >= num2 && num1 >= num3){biggest = num1;}		
		
		else if(num2 >= num1 && num2 >= num3){biggest = num2;}
		else if(num3 >= num1 && num3 >= num2){biggest = num3;}		
		else{System.out.println("Numbers are not unique");}
						
		return biggest;		
	}
	
	//number to the power of method
	public static double myPow(double a, int b)
	{	
		result = 1;
		
		for (int x = 0; b > x; x++)
		{	if(b == 0){result = 1;}	
			else if(b == 1){result = a;}			
			else if(b < 0){System.out.print("\nNot a positive whole number");}			
			else{result = result * a;}			
		}		
		
		return result;
	}
	
	//sum of numbers from 1 to nth number
	public static int sumOfNumbers(int num1)
	{	
		biggest = 0;
		
		if(num1 > 0){for(int x = 1; num1 >= x; x++){biggest += x;}}
		else
		{
			System.out.print("\nNumber cannot be lesser than 1");
			biggest = 0;
		}
		
		return biggest;
	}
	
	//factorial of a number method
	public static int factorial(int num1)
	{	
		if(num1 == 0){biggest = 0;}
		else if(num1 >= 1)
		{	biggest = 1;
			
			for(int x = 1; num1 >= x; x++){biggest *= x;}
		}
		
		return biggest;
	}
	
	//prime number checker method
	public static boolean isPrimeNumber(int num1)
	{	
		biggest = 0;
		
		for(int x = 1; num1 >= x; x++)
		{
			if(num1 % x == 0){biggest++;}
		}
		
		if(biggest < 3){return true;}
		else{return false;}
	}
	
	//check if password is valid combination
	public static String passwordCheck(String pass)
	{	int digi=0;
		int upper=0;
		int lower=0;
			
		for(int x = 0; pass.length() > x; x++)
		{		if(Character.isDigit(pass.charAt(x))){digi++;}
				else if (Character.isUpperCase(pass.charAt(x))){upper++;}
				else if(Character.isLowerCase(pass.charAt(x))){lower++;}
		}
		
		if((digi > 0) && (upper > 0) && (lower > 0) && pass.length() >= 8){return "Valid";}
		else{return "NOT Valid!" + digi + ":Digit " + upper + ":Uppercase " + lower + ":Lowercase";}			
	}	
}