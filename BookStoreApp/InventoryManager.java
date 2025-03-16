package com.program;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InventoryManager {
	private List<Book> books = new ArrayList<>();
	private static final String FILE_NAME = "inventory.ser";
	
	// Add new book
	public void addBook(Book book) {
		books.add(book);
		System.out.println("Book added successfully.");
	}

	// Update stock of a book
	public void updateStock(String id, int newStock) throws ResourceNotFoundException {
		for (Book book : books) {
			if (book.getId().equals(id)) {
				book.setStock(newStock);
				System.out.println("Stock updated successfully.");
				System.out.println("Updated Book: " + book);
				return;
			}
		}
		throw new ResourceNotFoundException("Book with ID " + id + " not found.");
	}
	
	// Set discount for a category
	public void setDiscount(Category category, double discount) {
		for (Book book : books) {
			if (book.getCategory() == category) {
				book.setDiscount(discount);
				System.out.println("Discount Book : " + book);
			}
		}
		System.out.println("Discount set successfully for category " + category);
	}
	
	// Remove books out of stock for more than 6 months
	public void removeOldStock() {
		Iterator<Book> iterator = books.iterator();
		LocalDate sixMonthsAgo = LocalDate.now().minusMonths(6);
		boolean removed = false;
		while (iterator.hasNext()) {
			Book book = iterator.next();
			if (book.getStock() == 0 || book.getStockUpdateDate().isBefore(sixMonthsAgo)) {
				iterator.remove();
				removed = true;
				System.out.println("Removed old stock " + book);
			}	
		}
		if (!removed) {
			System.out.println("No old stock books found to remove.");
		} else {
			System.out.println("Old stock removed successfully.");
		}
	}
	
	// Save inventory to file
	public void saveInventory() throws IOException {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
			oos.writeObject(books);
			System.out.println("Inventory saved successfully.");
		}
	}
	
	// Load inventory from file
	public void loadInventory() throws IOException, ClassNotFoundException {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
			books = (List<Book>) ois.readObject();
			System.out.println("Inventory loaded successfully.");
			displayBooks();
		}
	}

	// Display all books
	public void displayBooks() {
		if (books.isEmpty()) {
			System.out.println("No books in inventory.");
		} else {
			books.forEach(System.out::println);
		}
	}
		
}
