package com.bookstore.bookstore.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Document(collection = "Client")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Client {

    @Id
    private String id;

    private String fullName;

    private String username;

    private String password;

    private String lastName;

    private boolean isActive;

    private Set<Book> cart;

}
