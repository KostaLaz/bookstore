package com.bookstore.bookstore.repository;

import com.bookstore.bookstore.domain.Cart;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends MongoRepository<Cart, Integer> {
}
