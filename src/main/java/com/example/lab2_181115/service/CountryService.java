package com.example.lab2_181115.service;

import com.example.lab2_181115.model.Country;

import java.util.List;
import java.util.Optional;

public interface CountryService {
    List<Country> findAll();
    Optional<Country> findById(Long id);
    void deleteById(Long id);
}