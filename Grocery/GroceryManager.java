package com.cdac.program;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GroceryManager {
	private List<GroceryItem> groceries = new ArrayList<>();
	
	public GroceryManager() {
		this.groceries = new ArrayList<>();
	}

	public void addGroceryItem(String name, float pricePerUnit, int stock, LocalDate updateDateTime) throws ResourceNotFoundException {
		// validate name
		if (name == null) {
			throw new ResourceNotFoundException("Grocery name cannot be empty.");
		}
		
		if (stock < 0) {
			throw new ResourceNotFoundException("Stock cannot be negative.");
		}
		
		groceries.add(new GroceryItem(name, pricePerUnit, stock, updateDateTime));
	}
	
	public void updateQty() {
		
	}
	
	public void displayItems() {
		if (groceries.isEmpty()) {
			System.out.println("The list of groceries is empty.");
		} else {
			groceries.forEach(System.out::println);
		}
	}
	
	public void removeEmptyStockItem() {
		for (GroceryItem item : groceries) {
			if (item.getStock() == 0) {
				groceries.remove(item);
				System.out.println("Item removed: " + item);
			}
		}
		System.out.println("Removed all empty stock items.");
	}
	
	public void displayUpdatedItems() {
		
	}
}
