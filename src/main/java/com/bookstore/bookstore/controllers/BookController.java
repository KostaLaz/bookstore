package com.bookstore.bookstore.controllers;

import com.bookstore.bookstore.domain.Book;
import com.bookstore.bookstore.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/books")
public class BookController {

    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }


    @GetMapping("/allbooks")
    public Set<Book> getAllBooks(){
       return bookService.getAllBooks();
    }

    @GetMapping("/byauthor")
    public Set<Book> getBooksByAuthor(@PathVariable String author){
        return bookService.getBooksByAuthor(author);
    }



}
