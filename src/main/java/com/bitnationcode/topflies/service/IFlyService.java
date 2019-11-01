package com.bitnationcode.topflies.service;

import com.bitnationcode.topflies.exceptions.ResourceNotFoundException;
import com.bitnationcode.topflies.model.Fly;

import java.util.List;

public interface IFlyService {

    List<Fly> getFlies();

    Fly saveFly(Fly fly);

    Fly findById(Long flyId) throws ResourceNotFoundException;

    Fly updateFly(Fly fly) throws ResourceNotFoundException;

    void deleteFly(Long flyId) throws ResourceNotFoundException;
}
