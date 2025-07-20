package com.book.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.book.model.Book;

public interface BookRepository extends CrudRepository<Book,Integer>{
	
	public List<Book> findByTitle(String title);
	
	public Book findByIsbnNo(String isbnNo);
	
	public List<Book> findByPrice(float price);

}
