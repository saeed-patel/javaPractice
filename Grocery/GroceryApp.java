package com.cdac.program;

import java.time.LocalDate;
import java.util.Scanner;

public class GroceryApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GroceryManager allGroceries = new GroceryManager();
		
		while (true) {
			System.out.println("1. Add a new grocery item");
			System.out.println("2. Update the quantity of a grocery item");
			System.out.println("3. Display the list of grocery items (name,price,quantity)");
			System.out.println("4. Remove all empty stock items");
			System.out.println("5. Display all products for which stock updated in last 3 days");
			System.out.println("6. Exit");
			System.out.println("Enter your choice: ");
			
			int choice = sc.nextInt();
			
			try {
				switch (choice) {
					case 1:
						System.out.println("Enter grocery name: ");
						String name = sc.next();
						
						System.out.println("Enter grocery price per unit: ");
						float price = sc.nextFloat();
						
						System.out.println("Enter grocery stock: ");
						int stock = sc.nextInt();
						
						System.out.println("Enter Stock Update Date (YYYY-MM-DD): ");
						LocalDate stockUpdateDate =  LocalDate.parse(sc.next());
						
						allGroceries.addGroceryItem(name, price, stock, stockUpdateDate);				
						break;
						
					case 2:
						break;
						
					case 3:
						System.out.println("List of all items: ");
						allGroceries.displayItems();
						System.out.println("End of list **************");
						break;
						
					case 4:
						
						break;
						
					case 5:
						break;
						
					case 6:
						System.out.println("Exiting the Grocery app. Bye!!");
						sc.close();
						System.exit(0);
						
					default:
						System.out.println("Inavlid input!");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
