package com.assignments;

public class Soln1 {
	public static void main(String [] args) {
		System.out.println("Enter the radius of circle: ");
		float radius = ConsoleInput.getRadius();
		final float PI = 3.141f;
		double perimeter = 2 * PI * radius;
		double area = PI * radius * radius;
		System.out.println("Perimeter is = " + perimeter);
		System.out.println("Area is = " + area);
	}
}
