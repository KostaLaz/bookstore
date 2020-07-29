package com.bookstore.bookstore.repository;

import com.bookstore.bookstore.domain.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.Set;
@Repository
public interface BookRepository extends MongoRepository<Book, String> {

    Optional<Book> findById(String id);

    List<Book> findByAuthor(String author);

    List<Book> findByTitle(String title);

    Set<Book> findByTitleAndAuthor(String title, String author);

    List<Book> findByGenre(String genre);

    void deleteById(String id);

}
