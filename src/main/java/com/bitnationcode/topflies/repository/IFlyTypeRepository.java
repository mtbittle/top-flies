package com.bitnationcode.topflies.repository;

import com.bitnationcode.topflies.model.FlyType;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Michael
 * @date 11/3/2019
 **/
public interface IFlyTypeRepository extends JpaRepository<FlyType, Long> {
}
