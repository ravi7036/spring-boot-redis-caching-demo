package com.demo.apps.cache.util;

import com.demo.apps.cache.dto.CountryDto;
import com.demo.apps.cache.entity.Country;

public interface ICountryMapper {
    public Country toCountry(CountryDto countryDto) ;

    CountryDto fromCountry(Country country);
}
