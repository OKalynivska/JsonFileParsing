package com.softserve.edu;

public class Book {
    String author;
    String bookTitle;

    public Book() {
    }

    public Book(String author, String bookTitle) {
        this.author = author;
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    @Override
    public String toString() {
        return "[" +
                "\"author\":'" + author + '\'' +
                ", \"bookTitle\":'" + bookTitle + '\'' +
                "]";
    }
}
