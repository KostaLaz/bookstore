package com.bookstore.bookstore.repository;

import com.bookstore.bookstore.domain.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Set;

public interface BookRepository extends MongoRepository<Book, Long> {

    Set<Book> findByAuthor(String author);

    List<Book> findByTitle(String title);

    Set<Book> findByTitleAndAuthor(String title, String author);

    List<Book> findByGenre(String ganre);

}
