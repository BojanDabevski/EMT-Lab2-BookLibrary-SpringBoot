package com.example.lab2_181115.service.serviceImplementation;

import com.example.lab2_181115.model.Country;
import com.example.lab2_181115.repository.CountryRepository;
import com.example.lab2_181115.service.CountryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryServiceImpl implements CountryService {

    private final CountryRepository countryRepository;

    public CountryServiceImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }


    @Override
    public List<Country> findAll() {
        return countryRepository.findAll();
    }

    @Override
    public Optional<Country> findById(Long id) {
        Country country = countryRepository.findById(id).orElseThrow(RuntimeException::new);
        return Optional.of(country);
    }

    @Override
    public void deleteById(Long id) {
        countryRepository.deleteById(id);
    }
}