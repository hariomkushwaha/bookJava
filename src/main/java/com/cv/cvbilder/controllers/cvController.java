package com.cv.cvbilder.controllers;

import com.cv.cvbilder.entities.Book;
import com.cv.cvbilder.services.BookService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class cvController {  
    
    @Autowired
    private BookService bookservice;
    
    @GetMapping("/books")
    public List<Book> getBooks(){
        return this.bookservice.getAllBooks();
    }

    @GetMapping("/books/{id}")
    public Book getBook(@PathVariable("id") int id){
        return this.bookservice.getSingleBooks(id);
    }

    @PostMapping("/books")
    public Book addBook(@RequestBody Book book){
        Book b= this.bookservice.addBook(book);
        return b;
    }
}
