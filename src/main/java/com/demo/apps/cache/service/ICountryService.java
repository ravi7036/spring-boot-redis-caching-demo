package com.demo.apps.cache.service;

import com.demo.apps.cache.entity.Country;

import java.util.List;

public interface ICountryService {
    public List<Country> getAllCountries();
    public List<String> getAllCountryNames();
    public List<Country> insertCountries();

    Country insertCountry(Country mappedCountry);
}
