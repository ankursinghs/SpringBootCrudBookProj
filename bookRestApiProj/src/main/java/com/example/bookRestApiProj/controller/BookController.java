package com.example.bookRestApiProj.controller;

import com.example.bookRestApiProj.entity.Book;
import com.example.bookRestApiProj.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("getBooks")
    public List<Book> getBooks(){
        return bookService.getBooks();
    }

    @PostMapping("addBook")
    public Book addBook(@RequestBody Book book){
        return bookService.addBook(book);
    }

    @DeleteMapping("deleteBook")
    public Book deleteBook(@RequestBody Book book){
        return bookService.deleteBook(book);
    }

    @PutMapping("updateBook")
    public Book updateBook(@RequestBody Book book){
        return bookService.updateBook(book);
    }
}
