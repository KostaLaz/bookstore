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
    private Long id;

    private String title;

    private String author;

    private String genre;

    private int numOfPages;

    private double price;

    private BookType type;

}
