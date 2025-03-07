package com.assignments;

public class Soln4 {
	
	public static void main(String [] args) {
		
		System.out.println("Input the first number : ");
		int num1 = ConsoleInput.getInteger();
		System.out.println("Input the second number : ");
		int num2 = ConsoleInput.getInteger();
		System.out.println("Input the third number : ");
		int num3 = ConsoleInput.getInteger();
		
		boolean result = false;
		if ((num2 > num1) && (num3 > num2))
			result = true;
		System.out.println("The result is : " + result);
	}
}
