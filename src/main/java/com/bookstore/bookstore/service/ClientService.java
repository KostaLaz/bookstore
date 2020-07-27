package com.bookstore.bookstore.service;

import com.bookstore.bookstore.domain.Client;

import java.util.List;

public interface ClientService {
    List<Client> getAllClients();

    List<Client> getClientsByNumberOfBooks(Integer numOfBooks);

    List<Client> getClientByCadrNumber(Integer cardNumber);
}
