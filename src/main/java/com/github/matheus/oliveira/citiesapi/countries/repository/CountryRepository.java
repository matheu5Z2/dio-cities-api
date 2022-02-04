package com.github.matheus.oliveira.citiesapi.countries.repository;

import com.github.matheus.oliveira.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
