package com.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.book.model.Book;
import com.book.servicei.BookServiceI;

@RestController
public class BookController {

	@Autowired
	BookServiceI bi;
	
	//add new book
	@PostMapping("/postBook")
	public Book postBook(@RequestBody Book b) {
		
		System.out.println("In RestController class...!!");
		System.out.println(b.getAuthor_name());
		bi.AddBook(b);
		return b;
	}
	
	@GetMapping("/getAllRecords")
	public List<Book> getAllBook(){
		
		return bi.ListAllBook();
	}
	
	@GetMapping("/getBookById/{id}")
	public Book getBookById(@PathVariable int id) {
		
		return bi.getBookById(id);
	}
	
	@PutMapping("/updateBookData/{id}")
	public Book updateBookInfo(@PathVariable int id,@RequestBody Book b) {
		
		Book singleRecord = bi.getBookById(id);
		singleRecord.setId(b.getId());
		singleRecord.setTitle(b.getTitle());
		singleRecord.setAuthor_name(b.getAuthor_name());
		singleRecord.setPrice(b.getPrice());
		singleRecord.setIsbn_no(b.getIsbnNo());
		
		bi.AddBook(singleRecord);
		return singleRecord;
	}
	
	@DeleteMapping ("/deleteById/{id}")
	public String deleteRecord(@PathVariable int id) {
		
		bi.deleteBookById(id);
		return "Record Deleted...!!";
	}
	
	@GetMapping("/getBookByTitle/{title}")
	public List<Book> getBookByTitle(@PathVariable String title){
		
		return bi.getBookByTitle(title);
	}
	

	@GetMapping("/getSingleRecordByIsbn/{isbnNo}")
	public Book getSingleBook(@PathVariable String isbnNo) {
		
		return bi.getBookByIsbnNumber(isbnNo);
	
	}
	
	@GetMapping("/getBookByPrice/{price}")
	public List<Book> getBookByPrice(@PathVariable float price){
		return bi.getBookByPrice(price);
	}
}

