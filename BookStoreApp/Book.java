package com.program;

import java.io.Serializable;
import java.time.LocalDate;

public class Book implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String title;
	private String author;
	private Category category;
	private double price;
	private int stock;
	private LocalDate stockUpdateDate;
	private String publisher;
	private double discount;
	
	public Book(String id, String title, String author, Category category, double price, int stock,
			LocalDate stockUpdateDate, String publisher) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
		this.stock = stock;
		this.stockUpdateDate = stockUpdateDate;
		this.publisher = publisher;
	}
	
	public Book() {
		super();
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public Category getCategory() {
		return category;
	}
	
	public void setCategory(Category category) {
		this.category = category;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getStock() {
		return stock;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
		this.stockUpdateDate = LocalDate.now();
	}
	
	public LocalDate getStockUpdateDate() {
		return stockUpdateDate;
	}
	
	public void setStockUpdateDate(LocalDate stockUpdateDate) {
		this.stockUpdateDate = stockUpdateDate;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public double getDiscount() {
		return discount;
	}
	
	public void setDiscount(double discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", category=" + category + ", price="
				+ price + ", stock=" + stock + ", stockUpdateDate=" + stockUpdateDate + ", publisher=" + publisher
				+ ", discount=" + discount + "]";
	}
	
}
