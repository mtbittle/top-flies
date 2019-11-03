package com.bitnationcode.topflies.repository;

import com.bitnationcode.topflies.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Michael
 * @date 11/3/2019
 **/
public interface ICountryRepository extends JpaRepository<Country, Long> {
}
