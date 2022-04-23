package com.example.lab2_181115.web;

import com.example.lab2_181115.model.Author;
import com.example.lab2_181115.service.AuthorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public class AuthorController {
    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping
    public ResponseEntity<List<Author>> listAllAuthors(){
        return ResponseEntity.ok(authorService.findAll());
    }

    @GetMapping("{id}")
    public ResponseEntity<Author> findById(@PathVariable Long id){
        return ResponseEntity.of(authorService.findById(id));
    }
}
