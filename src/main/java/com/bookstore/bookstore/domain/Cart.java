package com.bookstore.bookstore.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "Cart")
@NoArgsConstructor
@AllArgsConstructor
public class Cart {
    @Id
    private String id;
    private int numberOfProducts;
    private double totalPrice;

    private Client client;

    private List<Book> books;
}
