package com.bookstore.bookstore.service;

import com.bookstore.bookstore.domain.Book;
import com.bookstore.bookstore.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    @Override
    public Set<Book> getAllBooks() {
        return null;
    }

    @Override
    public List<Book> getBooksByAuthor(String author) {
        return null;
    }

    @Override
    public List<Book> getBooksByTitle(String title) {
        return null;
    }

    @Override
    public List<Book> getBooksByGenre(String genre) {
        return null;
    }

    @Override
    public void addBook(Book book) {

    }
}
