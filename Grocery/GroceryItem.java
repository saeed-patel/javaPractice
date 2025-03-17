package com.cdac.program;

import java.time.LocalDate;

public class GroceryItem {
	private String name;
	private float pricePerunit;
	private int stock;
	private LocalDate updateDateTime;
	
	
	
	public GroceryItem() {
		super();
	}
	
	
	
	public GroceryItem(String name, float pricePerunit, int stock, LocalDate updateDateTime) {
		super();
		this.name = name;
		this.pricePerunit = pricePerunit;
		this.stock = stock;
		this.updateDateTime = updateDateTime;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPricePerunit() {
		return pricePerunit;
	}
	public void setPricePerunit(float pricePerunit) {
		this.pricePerunit = pricePerunit;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public LocalDate getUpdateDateTime() {
		return updateDateTime;
	}
	public void setUpdateDateTime(LocalDate updateDateTime) {
		this.updateDateTime = updateDateTime;
	}



	@Override
	public String toString() {
		return "GroceryItem [name=" + name + ", pricePerunit=" + pricePerunit + ", stock=" + stock + "]";
	}
	
	
	
}
