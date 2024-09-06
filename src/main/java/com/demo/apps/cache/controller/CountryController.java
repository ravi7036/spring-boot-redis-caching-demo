package com.demo.apps.cache.controller;



import com.demo.apps.cache.dto.CountryDto;
import com.demo.apps.cache.entity.Country;
import com.demo.apps.cache.service.ICountryService;
import com.demo.apps.cache.util.ICountryMapper;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/country")
public class CountryController {

    private final ICountryService countryService;

    private final ICountryMapper countryMapper;

    @GetMapping("/all")
    public List<Country> getAllCountries(){
        return countryService.getAllCountries();
    }

    @PostMapping
    public ResponseEntity<CountryDto> insertCountry(@RequestBody CountryDto countryDto){
        Country mappedCountry = countryMapper.toCountry(countryDto);
        Country country = countryService.insertCountry(mappedCountry);
        return ResponseEntity.ok(countryMapper.fromCountry(country));
    }

    @GetMapping("/names")
    public List<String> getAllCountryNames(){
        return countryService.getAllCountryNames();
    }


    public List<Country> insertCountries(){
        return countryService.insertCountries();
    }
}