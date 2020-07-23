package com.bookstore.bookstore.controllers;

import com.bookstore.bookstore.domain.Book;
import com.bookstore.bookstore.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/books")
public class BookController {

    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }


    @GetMapping("/allbooks")
    public Set<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/byauthor/{author}")
    public Set<Book> getBooksByAuthor(@PathVariable String author) {
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
    public void addBook(Book book){
        bookService.addBook(book);
    }


}
