package com.example.lab2_181115.service;

import com.example.lab2_181115.model.Book;
import com.example.lab2_181115.model.Category;

import java.util.List;
import java.util.Optional;

public interface BookService {
    List<Book> findAll();

    Optional<Book> findById(Long id);

    void deleteById(Long id);

    Optional<Book> save(String name, Category category, Long author, Integer availableCopies);

    default Optional<Book> edit(Long id, String name, Category category, Long author, Integer availableCopies) {
        return null;
    }

    void markAsTakenBook(Long id);
}