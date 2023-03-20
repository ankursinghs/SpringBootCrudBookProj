package com.example.bookRestApiProj.service;

import com.example.bookRestApiProj.entity.Book;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface BookService {

    public List<Book> getBooks();

    public Book addBook(Book book);

    public Book deleteBook(Book book);

    public Book updateBook(Book book);
}
