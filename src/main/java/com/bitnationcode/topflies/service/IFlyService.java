package com.bitnationcode.topflies.service;

import com.bitnationcode.topflies.exceptions.ResourceNotFoundException;
import com.bitnationcode.topflies.model.Fly;
import com.bitnationcode.topflies.model.FlyType;
import com.bitnationcode.topflies.repository.FlyIdAndName;

import java.util.List;

/**
 * Spring Data JPA interface for Fly model
 * @author Michael
 */
public interface IFlyService {

    List<Fly> getAllFlies();

    Fly saveFly(Fly fly);

    Fly findById(Long flyId) throws ResourceNotFoundException;

    Fly updateFly(Fly fly) throws ResourceNotFoundException;

    void deleteFly(Long flyId) throws ResourceNotFoundException;

    /**
     * Retrieves a projection containing the row ID and name attribute
     * @return
     */
    List<FlyIdAndName> getFlyIdAndNames();

    List<FlyType> getAllFlyTypes();
}
