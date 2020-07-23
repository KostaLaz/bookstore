package com.bookstore.bookstore.repository;

import com.bookstore.bookstore.domain.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, Long> {

}
