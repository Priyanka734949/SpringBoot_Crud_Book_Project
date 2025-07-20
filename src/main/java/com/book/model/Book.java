package com.book.model;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;

@Entity
public class Book {

	@Id
	private int id;
	private String title;
	private String author_name;
	private float price;
	private String isbnNo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor_name() {
		return author_name;
	}
	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getIsbnNo() {
		return isbnNo;
	}
	public void setIsbn_no(String isbnNo) {
		this.isbnNo = isbnNo;
	}
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author_name=" + author_name + ", price=" + price
				+ ", isbn_no=" + isbnNo + "]";
	}
	
	
}
