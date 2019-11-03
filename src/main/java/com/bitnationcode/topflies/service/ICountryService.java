package com.bitnationcode.topflies.service;

import com.bitnationcode.topflies.model.Country;

import java.util.List;

/**
 * @author Michael
 * @date 11/3/2019
 **/
public interface ICountryService {

    List<Country> findAllCountries();

    Country saveCountry(Country country);
}
