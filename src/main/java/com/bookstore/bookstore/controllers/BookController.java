package com.bookstore.bookstore.controllers;

import com.bookstore.bookstore.domain.Book;
import com.bookstore.bookstore.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping("/books")
public class BookController {

    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }


    @GetMapping("/allbooks")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/id/{id}")
    public Optional<Book> getBookById(String id){
        return bookService.getBookById(id);
    }

    @GetMapping("/byauthor/{author}")
    public List<Book> getBooksByAuthor(@PathVariable String author) {
        return bookService.getBooksByAuthor(author);
    }

    @GetMapping("/bytitle/{title}")
    public List<Book> getBookByTitle(@PathVariable String title) {
        return bookService.getBooksByTitle(title);
    }

    @GetMapping("/titleandauthor")
    public Set<Book> getBooksByTitleAndAuthor(@PathVariable String title, @PathVariable String author) {
        return bookService.getBookByTitleAndAuthor(title, author);
    }

    @GetMapping("/bygenre/{genre}")
    public List<Book> getBooksByGenre(@PathVariable String genre) {
        return bookService.getBooksByGenre(genre);
    }

    @PostMapping("/addbook")
    public void addBook(@RequestBody Book book){
        bookService.addBook(book);
    }


    @DeleteMapping("/deletebyid/{id}")
    public void deleteById(@PathVariable String id){
        bookService.deleteBookById(id);
    }

    @DeleteMapping("/deletebook")
    public void deleteBook(@RequestBody Book book){
        bookService.deleteBook(book);
    }

}
