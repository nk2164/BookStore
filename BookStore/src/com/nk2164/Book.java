package com.nk2164;

public class Book {

	private String title;
	private String author;
	private float price;
	
	public Book(String title,String author,float price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}

	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public float getPrice() {
		return price;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
}