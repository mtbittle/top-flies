package com.bitnationcode.topflies.repository;

import com.bitnationcode.topflies.model.Season;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Michael
 * @date 11/3/2019
 **/
public interface ISeasonRepository extends JpaRepository<Season, Long> {

}
