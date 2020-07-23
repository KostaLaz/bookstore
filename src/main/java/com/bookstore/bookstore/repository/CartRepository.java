package com.bookstore.bookstore.repository;

import com.bookstore.bookstore.domain.Cart;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CartRepository extends MongoRepository<Cart, Long> {
}
