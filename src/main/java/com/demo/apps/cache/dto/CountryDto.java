package com.demo.apps.cache.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CountryDto {
    String code;
    String name;
    String nativeName;
    long phone;
    String capital;
    String continent;
    String currency;
    List<String> language;
    String flag;

}
