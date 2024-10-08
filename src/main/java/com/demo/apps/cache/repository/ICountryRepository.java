package com.demo.apps.cache.repository;

import com.demo.apps.cache.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ICountryRepository extends JpaRepository<Country,String> {

    @Query("SELECT c.name FROM Country c")
    List<String> findAllCountryNames();
}