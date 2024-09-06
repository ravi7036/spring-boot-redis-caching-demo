package com.demo.apps.cache.service;

import com.demo.apps.cache.dto.CacheNames;
import com.demo.apps.cache.entity.Country;
import com.demo.apps.cache.repository.ICountryRepository;
import com.demo.apps.cache.util.CountryInitializer;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CountryService implements ICountryService {

    private final ICountryRepository countryRepository;

    @Override
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    @Cacheable(CacheNames.COUNTRY_NAMES)
    @Override
    public List<String> getAllCountryNames() {
        return countryRepository.findAllCountryNames();
    }

    @Override
    public List<Country> insertCountries() {
        return countryRepository.saveAll(CountryInitializer.readCountries());
    }

    @Override
    public Country insertCountry(Country mappedCountry) {
        return countryRepository.save(mappedCountry);
    }
}