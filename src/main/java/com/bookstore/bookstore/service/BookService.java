package com.bookstore.bookstore.service;

import com.bookstore.bookstore.domain.Book;

import java.util.List;
import java.util.Set;

public interface BookService {

    Set<Book> getAllBooks();

    List<Book> getBooksByAuthor(String author);

    List<Book> getBooksByTitle(String title);

    List<Book> getBooksByGenre(String genre);

    void addBook(Book book);

}
