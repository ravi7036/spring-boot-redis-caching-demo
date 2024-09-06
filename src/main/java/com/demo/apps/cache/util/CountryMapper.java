package com.demo.apps.cache.util;

import com.demo.apps.cache.dto.CountryDto;
import com.demo.apps.cache.entity.Country;
import org.springframework.stereotype.Component;

@Component
public class CountryMapper implements ICountryMapper {
    @Override
    public Country toCountry(CountryDto countryDto) {
        return Country.builder()
                .language(countryDto.getLanguage())
                .currency(countryDto.getCurrency())
                .phone(countryDto.getPhone())
                .continent(countryDto.getContinent())
                .code(countryDto.getCode())
                .nativeName(countryDto.getNativeName())
                .flag(countryDto.getFlag())
                .name(countryDto.getName())
                .capital(countryDto.getCapital())
                .build();
    }

    @Override
    public CountryDto fromCountry(Country country) {
        return CountryDto.builder()
                .language(country.getLanguage())
                .currency(country.getCurrency())
                .phone(country.getPhone())
                .continent(country.getContinent())
                .code(country.getCode())
                .nativeName(country.getNativeName())
                .flag(country.getFlag())
                .capital(country.getCapital())
                .build();
    }
}
