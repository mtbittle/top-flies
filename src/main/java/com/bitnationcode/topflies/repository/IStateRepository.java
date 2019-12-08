package com.bitnationcode.topflies.repository;

import com.bitnationcode.topflies.model.State;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Michael
 * @date 11/3/2019
 **/
public interface IStateRepository extends JpaRepository<State, Long> {

}
