package com.bookstore.bookstore.service;

import com.bookstore.bookstore.domain.Book;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface BookService {

    List<Book> getAllBooks();

    Optional<Book> getBookById(String id);

    List<Book> getBooksByAuthor(String author);

    List<Book> getBooksByTitle(String title);

    Set<Book> getBookByTitleAndAuthor(String title, String author);

    List<Book> getBooksByGenre(String genre);

    void addOrUpdateBook(Book book);

    void deleteBookById(int id);

    void deleteBook(Book book);

}
