package com.softserve.edu;

import java.util.List;

public class Site {
    int id;
    List<Book> books;

    public Site() {
    }

    public Site(int id, List<Book> books) {
        this.id = id;
        this.books = books;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "[" +
                "\"id\":" + id +
                ", \"books\":" + books +
                "]";
    }
}
