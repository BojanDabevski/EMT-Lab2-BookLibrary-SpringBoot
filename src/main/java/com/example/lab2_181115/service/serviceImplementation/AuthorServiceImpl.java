package com.example.lab2_181115.service.serviceImplementation;

import com.example.lab2_181115.model.Author;
import com.example.lab2_181115.repository.AuthorRepository;
import com.example.lab2_181115.service.AuthorService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }


    @Override
    public List<Author> findAll() {
        return authorRepository.findAll();
    }

    @Override
    public Optional<Author> findById(Long id) {
        Author author = authorRepository.findById(id).orElseThrow(RuntimeException::new);
        return Optional.of(author);
    }

    @Override
    public void deleteById(Long id) {
        authorRepository.deleteById(id);
    }
}