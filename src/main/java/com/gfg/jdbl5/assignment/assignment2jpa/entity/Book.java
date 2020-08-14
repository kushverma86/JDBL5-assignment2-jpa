package com.gfg.jdbl5.assignment.assignment2jpa.entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String bookName;
    private String authorName;
    private int cost;

    @CreationTimestamp
    private Timestamp insertTimeStamp;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Timestamp getInsertTimeStamp() {
        return insertTimeStamp;
    }

    public void setInsertTimeStamp(Timestamp insertTimeStamp) {
        this.insertTimeStamp = insertTimeStamp;
    }
}
