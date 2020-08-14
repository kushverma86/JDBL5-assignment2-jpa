package com.gfg.jdbl5.assignment.assignment2jpa.repository;

import com.gfg.jdbl5.assignment.assignment2jpa.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface BookRepository extends JpaRepository<Book, Integer> {


    @Query("select b from Book b where b.authorName LIKE :find%")
    public List<Book> findByFirstName(String find);

    @Query(value = "select * from Book b where b.cost > :cost", nativeQuery = true)
    public List<Book> findByCostGreater(int cost);



}
