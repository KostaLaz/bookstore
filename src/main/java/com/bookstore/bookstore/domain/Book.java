package com.bookstore.bookstore.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Book")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    private String id;

    private String title;

    private String author;

    private String genre;

    private String description;

    private int numOfPages;

    private double price;

}
