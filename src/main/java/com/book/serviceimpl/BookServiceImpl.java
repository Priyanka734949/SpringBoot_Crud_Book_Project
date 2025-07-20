package com.book.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.book.model.Book;
import com.book.repository.BookRepository;
import com.book.servicei.BookServiceI;

@Service
public class BookServiceImpl implements BookServiceI {

	@Autowired
	BookRepository br;
	
	@Override
	public void AddBook(Book b) {
		
		System.out.println("In Service..!!");
		System.out.println(b.getAuthor_name());
		br.save(b);
	}

	@Override
	public List<Book> ListAllBook() {
	
		return (List<Book>) br.findAll() ;
	}


	@Override
	public Book getBookById(int id) {
		
		return br.findById(id).get();
	}

	@Override
	public void deleteBookById(int id) {

		br.deleteById(id);
	}

	@Override
	public List<Book> getBookByTitle(String title) {
	
		return (List<Book>)br.findByTitle(title);
	}
	

	@Override
	public Book getBookByIsbnNumber(String isbnNo) {
		
		return br.findByIsbnNo(isbnNo);
	}

	@Override
	public List<Book> getBookByPrice(float price) {
		
		return (List<Book>) br.findByPrice(price);
	}
	
}
