package com.gfg.jdbl5.assignment.assignment2jpa.service;

import com.gfg.jdbl5.assignment.assignment2jpa.entity.Book;
import com.gfg.jdbl5.assignment.assignment2jpa.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }


    public Book addBook(Book book){
        return bookRepository.save(book);
    }


    public List<Book> replaceAuthorByFirstName(String find, String replace){
        List<Book> books = bookRepository.findByFirstName(find);
        List<Book> result = new ArrayList<>();

        for (Book book: books){
            String author = book.getAuthorName();
            String firstName = author.trim().split(" ")[0];

            if (firstName.equals(find)){
                book.setAuthorName(replace);
                result.add(bookRepository.save(book));
            }
        }
        return result;

    }

    public List<Book> deleteBookByGreaterCost(int cost){

        List<Book> books = bookRepository.findByCostGreater(cost);
        bookRepository.deleteAll(books);

        return books;
    }


}
