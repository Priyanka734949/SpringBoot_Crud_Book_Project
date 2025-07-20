# SpringBoot_Crud_Book_Project
The Book Management System is a web-based application built using Spring Boot.
It allows users to manage books and provides interface for performing CRUD (Add, Get, Update, Delete) operations on books.

Features :
- Create, read, update, and delete books
- Retrieve books by title, ISBN number, or price

Technologies Used :
- Spring Boot
- Java
- Spring Data JPA
- MySQL

Endpoints :
- POST /postBook: Create a new book
- GET /getAllRecords: Retrieve all books
- GET /getBookById/{id}: Retrieve a book by ID
- PUT /updateBookData/{id}: Update a book
- DELETE /deleteById/{id}: Delete a book
- GET /getBookByTitle/{title}: Retrieve books by title
- GET /getSingleRecordByIsbn/{isbnNo}: Retrieve a book by ISBN number
- GET /getBookByPrice/{price}: Retrieve books by price
