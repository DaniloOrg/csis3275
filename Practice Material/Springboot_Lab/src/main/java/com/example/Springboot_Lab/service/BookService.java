package com.example.Springboot_Lab.service;

import com.example.Springboot_Lab.DAO.BookDAO;
import com.example.Springboot_Lab.Entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class BookService {

    @Autowired
    private BookDAO bookDAO;

    public Collection<Book> getBooks(){
        return bookDAO.getBooks();
    }

    public Book createBook(Book book){
        return bookDAO.createBook(book);
    }
}
