package com.assignments;

public class Soln6 {
	public static void main(String [] args) 
	{
		int noOfPrimes = 0;
		int sumOfPrimes = 0;
		int num = 1;
		while (noOfPrimes < 100)
		{
			if (isPrime(num))
			{
//				System.out.println(num);
				sumOfPrimes += num;
				noOfPrimes += 1;
			}
			num += 1;
		}
		System.out.println("Sum of the first 100 prime numbers: " + sumOfPrimes);
	}
	
	public static boolean isPrime(int num) 
	{
		if (num <= 1) return false;
		if (num == 2) return true;
		for (int i=2; i*i<=num; i++) 
			{
				if (num%i == 0) 
					return false;
			}
		return true;
	}
	
}
