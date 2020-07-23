package com.bookstore.bookstore.repository;

import com.bookstore.bookstore.domain.Client;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClientRepository extends MongoRepository<Client, Long> {
}
