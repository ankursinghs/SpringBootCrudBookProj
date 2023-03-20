package com.example.bookRestApiProj.serviceImpl;

import com.example.bookRestApiProj.entity.Book;
import com.example.bookRestApiProj.repository.BookRepository;
import com.example.bookRestApiProj.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book addBook(Book book) {
        bookRepository.save(book);
        return book;
    }

    @Override
    public Book deleteBook(Book book) {
        bookRepository.delete(book);
        return book;
    }

    @Override
    public Book updateBook(Book book) {
        bookRepository.save(book);
        return book;
    }
}
