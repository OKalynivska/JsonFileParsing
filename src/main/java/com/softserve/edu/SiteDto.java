package com.softserve.edu;

import java.util.ArrayList;
import java.util.List;

public class SiteDto {
    private int id;
   public List<BookDto> booksDto;

    public SiteDto() {
    }

    public SiteDto(int id, List<BookDto> books) {
        this.id = id;
        this.booksDto = books;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<BookDto> getBooks() {
        return booksDto;
    }

    public void setBooks(List<BookDto> books) {
        this.booksDto = books;
    }


}
