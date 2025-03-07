package com.assignments;

public class Soln2 {
	public static void main(String[] args) {
		System.out.println("Enter the number of integer values you wish to add: ");
		int numberOfIntegers = ConsoleInput.getInteger();
		int sum = 0;
		for (int i=0; i<numberOfIntegers; i++) {
			System.out.println("Enter the value: ");
			int value = ConsoleInput.getInteger();
			sum += value;
		}
		System.out.println("Total of the above values: " + sum); 
	}
}
