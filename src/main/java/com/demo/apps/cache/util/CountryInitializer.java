package com.demo.apps.cache.util;

import com.demo.apps.cache.entity.Country;

import java.util.ArrayList;
import java.util.List;

public class CountryInitializer {

    public static List<Country> readCountries() {
        Country.builder().name("INDIA").build();
        List<Country> countryList = List.of(
                Country.builder()
                        .name("INDIA")
                        .code("1")
                        .continent("Asia")
                        .nativeName("Bharat")
                        .capital("Delhi")
                        .flag("Tri Color")
                        .currency("Rupee")
                        .phone(9849098490L)
                        .build());
        return countryList;
    }
}
