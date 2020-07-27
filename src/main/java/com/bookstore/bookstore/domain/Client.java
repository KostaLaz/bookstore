package com.bookstore.bookstore.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Collection;

@Document(collection = "Client")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Client {

    @Id
    private String id;

    private String name;

    private String lastName;

    private int cardNumber;

    private Collection<Book> cart;




}
