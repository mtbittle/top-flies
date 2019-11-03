package com.bitnationcode.topflies.service;

import com.bitnationcode.topflies.model.Country;
import com.bitnationcode.topflies.repository.ICountryRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Michael
 * @date 11/3/2019
 **/
@Service
@Transactional(readOnly = true)
public class CountryService implements ICountryService {

    private ICountryRepository countryRepository;

    public CountryService(ICountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public List<Country> findAllCountries() {
        return countryRepository.findAll(Sort.by(Sort.Direction.ASC, "abbreviation"));
    }

    @Override
    public Country saveCountry(Country country) {
        return countryRepository.save(country);
    }
}
