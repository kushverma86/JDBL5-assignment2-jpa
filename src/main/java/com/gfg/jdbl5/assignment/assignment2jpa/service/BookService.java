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


    public String replaceAuthorByFirstName(String find, String replace){
        try {
            bookRepository.updateByFirstName(find, replace);
        }
        catch (Exception e){
            e.printStackTrace();
            return "Update Fail";
        }

        return "Update Success";
    }

    public int deleteBookByGreaterCost(int cost){

        return bookRepository.deleteBookByCostGreater(cost);

    }


}
