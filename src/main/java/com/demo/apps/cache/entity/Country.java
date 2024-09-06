package com.demo.apps.cache.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Country {

    @Id
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
