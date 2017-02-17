package erwin.suarez.Lab1;

import java.util.Scanner;

public class TestMyMath{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int num1,num2,num3, result;
		String password;
		
		
		//biggest number
		System.out.print("Please enter 1st number: ");
		num1 = input.nextInt();		
		System.out.print("Please enter 2nd number: ");
		num2 = input.nextInt();		
		System.out.print("Please enter 3rd number: ");
		num3 = input.nextInt();		
		System.out.println("The biggest number is: " + MyMath.biggestNumber(num1,num2,num3));
		//System.out.println("The biggest number is: " + MyMath.biggestNumber(2,7,4));expect: 7
		
		
		
		//powers
		System.out.print("Please enter base : ");
		num1 = input.nextInt();		
		System.out.print("Please enter power number: ");
		num2 = input.nextInt();		
		System.out.println(num1 + " to the power of " + num2 + " is: " + MyMath.myPow(num1, num2));
		//System.out.println(num1 + " to the power of " + num2 + " is: " + MyMath.myPow(2, 4));expect: 16
		
		
		
		//the sum of number
		System.out.print("Please enter a number: ");
		num1 = input.nextInt();		
		System.out.println("The sum of numbers from 0 to " + num1 + " is: " + MyMath.sumOfNumbers(num1));
		//System.out.println("The sum of numbers from 0 to " + num1 + " is: " + MyMath.sumOfNumbers(4));expect: 10
		
		
		
		//factorial
		System.out.print("Please enter a number to get factorial: ");
		num1 = input.nextInt();		
		System.out.print("The factorial of " + num1 + " is: " + MyMath.factorial(num1));
		//System.out.print("The factorial of " + num1 + " is: " + MyMath.factorial(3));expect: 6
		
		
		
		//prime number
		System.out.print("\nPrime number check. Please enter a number: ");
		num1 = input.nextInt();		
		System.out.print(MyMath.isPrimeNumber(num1));
		//System.out.print(MyMath.isPrimeNumber(9));expect: false
		
		
		
		//password checker
		input.nextLine();
		System.out.print("\nPlease enter a password at least 8 characters long: ");
		password = input.nextLine();		
		System.out.print("Password is " + MyMath.passwordCheck(password));
		//System.out.print("Password is " + MyMath.passwordCheck(ErwinSuarez1));expect: Valid!		
	}
}