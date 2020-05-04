package com.bookstore.bookstore.service;

import com.bookstore.bookstore.domain.Book;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class BookstoreServiceImpl implements BookstoreService{
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
}
