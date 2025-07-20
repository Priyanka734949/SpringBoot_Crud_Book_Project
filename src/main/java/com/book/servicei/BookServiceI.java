package com.book.servicei;

import java.util.List;

import com.book.model.Book;

public interface BookServiceI {

	public void AddBook(Book b);
	
	public List<Book> ListAllBook();
	
	public Book getBookById(int id);
	
	public void deleteBookById(int id);
	
	public List<Book> getBookByTitle(String title);

	public Book getBookByIsbnNumber(String isbnNo);
	
	public List<Book> getBookByPrice(float price);

}
