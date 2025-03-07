package com.assignments;

public class Soln5 {
	public static void main(String [] args) {
		System.out.println("Input seconds: ");
		int seconds = ConsoleInput.getInteger();
		int hours = seconds / 3600;
		int remSeconds = seconds - (hours * 3600);
		int minutes = remSeconds / 60;
		remSeconds = remSeconds - (minutes * 60);
		System.out.print(hours);
		System.out.print(":");
		System.out.print(minutes);
		System.out.print(":");
		System.out.print(remSeconds);
	}
}
