package com.bookstore.bookstore.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.Map;

@Document(collection = "Order")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    @Id
    private Integer id;

    private Map<Book, Integer> items;

    private Date orderOn;

    private double totalPrice;

    private Client orderBy;

    public Order(Map<Book, Integer> items, double totalPrice, Client orderBy) {
        this.items = items;
        this.totalPrice = totalPrice;
        this.orderBy = orderBy;
    }

    public Order(Map<Book, Integer> items, Client orderBy) {
        this.items = items;
        this.orderBy = orderBy;
    }
}
