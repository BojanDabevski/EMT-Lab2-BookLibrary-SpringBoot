package com.example.lab2_181115.service;

import com.example.lab2_181115.model.Author;
import com.example.lab2_181115.model.Category;
import com.example.lab2_181115.model.Country;
import com.example.lab2_181115.model.Book;

import java.util.List;
import java.util.Optional;

public interface AuthorService {
    List<Author> findAll();
    Optional<Author> findById(Long id);
    void deleteById(Long id);
}