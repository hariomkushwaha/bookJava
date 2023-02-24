package com.cv.cvbilder.services;

import com.cv.cvbilder.entities.Book;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;


@Component
public class BookService {

    private static List<Book> list = new ArrayList<>(); 
    
    static{
        list.add(new Book(1,"Think and Grow Rich","Napoleon Hill"));
        list.add(new Book(2,"you²","Price Pritchett"));
        list.add(new Book(3,"Head First Networking","Al Anderson and Ryan Benedetti"));
    }

    public List<Book> getAllBooks(){
        return list;
    }

    public Book getSingleBooks(int id){
        Book singleBook = null;
        singleBook = list.stream().filter(e->e.getId()==id).findFirst().get();
        return singleBook;
    }
}
