package com.gfg.jdbl5.assignment.assignment2jpa.controller;

import com.gfg.jdbl5.assignment.assignment2jpa.entity.Book;
import com.gfg.jdbl5.assignment.assignment2jpa.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public List<Book> getBooks(){
        return bookService.getAllBooks();
    }

    @PostMapping("/books")
    public Book newBook(@RequestBody Book book){
        return bookService.addBook(book);
    }

    @PutMapping("/replaceWill")
    public String replaceAuthorWill(){
        return bookService.replaceAuthorByFirstName("Will", "William");
    }

    @DeleteMapping("/deletegreaterthan")
    public int deleteBookByGreaterCost(@RequestParam(value = "cost") int cost){
        return bookService.deleteBookByGreaterCost(cost);
    }
}
