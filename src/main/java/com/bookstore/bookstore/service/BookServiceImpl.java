package com.bookstore.bookstore.service;

import com.bookstore.bookstore.domain.Book;
import com.bookstore.bookstore.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    @Override
    public Set<Book> getAllBooks() {
        return (Set<Book>) bookRepository.findAll();
    }

    @Override
    public Optional<Book> getBookById(Integer id) {
        return bookRepository.findById(id);
    }


    @Override
    public Set<Book> getBooksByAuthor(String author) {
        return bookRepository.findByAuthor(author);
    }

    @Override
    public List<Book> getBooksByTitle(String title) {
        return bookRepository.findByTitle(title);
    }

    @Override
    public Set<Book> getBookByTitleAndAuthor(String title, String author) {
        return bookRepository.findByTitleAndAuthor(title, author);
    }


    @Override
    public List<Book> getBooksByGenre(String genre) {
        return bookRepository.findByGenre(genre);
    }

    @Override
    public void addBook(Book book) {
        bookRepository.save(book);
    }
}
