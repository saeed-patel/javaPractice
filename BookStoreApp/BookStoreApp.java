package com.program;

import java.time.LocalDate;
import java.util.Scanner;

public class BookStoreApp {
	

	public static void main(String[] args) {
		InventoryManager manager = new InventoryManager();
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("1. Add New Book");
			System.out.println("2. Update Stock of a Book");
			System.out.println("3. Set Discount for All Books of a Given Category");
			System.out.println("4. Remove Books that have not been in Stock for the last 6 months");
			System.out.println("5. Save Inventory to File");
			System.out.println("6. Load Inventory from File");
			System.out.println("7. Display All Books");
			System.out.println("8. Exit");
			System.out.println("Enter your choice: ");
			int choice = scanner.nextInt();
			
			try {
				switch (choice) {
				case 1:
					System.out.println("Enter ID: ");
					String id = scanner.next();
					
					System.out.println("Enter Title: ");
					String title = scanner.next();
					
					System.out.println("Enter Author: ");
					String author = scanner.next();
					
					System.out.println("Enter Category (FICTION/NONFICTION/SCIENCE/HISTORY/TECHNOLOGY): ");
					Category category = Category.valueOf(scanner.next().toUpperCase());
					
					System.out.println("Enter Price: ");
					double price = scanner.nextDouble();
					
					System.out.println("Enter Stock: ");
					int stock = scanner.nextInt();
					
					System.out.println("Enter Publisher: ");
					String publisher = scanner.next();
					
					System.out.println("Enter Stock Update Date (YYYY-MM-DD): ");
					LocalDate stockUpdateDate = LocalDate.parse(scanner.next());
					
					manager.addBook(new Book(id, title, author, category, price, stock, stockUpdateDate, publisher));
					break;
					
				case 2:
					System.out.println("Enter ID to update stock: ");
					String stockId = scanner.next();
					
					System.out.println("Enter New Stock: ");
					int newStock = scanner.nextInt();
					
					manager.updateStock(stockId, newStock);
					break;
				
				case 3:
					System.out.println("Enter Category: ");
					Category discountCategory = Category.valueOf(scanner.next().toUpperCase());
					System.out.println("Enter the discount percentage: ");
					double discount = scanner.nextDouble();
					manager.setDiscount(discountCategory, discount);
					break;
					
				case 4:
					manager.removeOldStock();
					break;
					
				case 5:
					manager.saveInventory();
					break;
					
				case 6:
					manager.loadInventory();
					break;
				
				case 7:
					manager.displayBooks();
					break;
					
				case 8:
					System.out.println("Exiting...");
					scanner.close();
					return;
					
				default:
					System.out.println("Invalid choice. Try again.");
				}
			} catch (Exception e) {
				System.out.println("Error: " + e.getMessage());
			}
		}
	}
}
