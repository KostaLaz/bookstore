package com.bookstore.bookstore.repository;

import com.bookstore.bookstore.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookstoreRepository extends JpaRepository<Book, Long> {

    List<Book> findAll();

    List<Book> findByTitle(String title);

    List<Book> findByAuthor(String author);

    List<Book> findByGanre(String ganre);

    List<Book> findByPrice(double price);

}
