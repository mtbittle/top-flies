package com.bitnationcode.topflies.service;

import com.bitnationcode.topflies.exceptions.ResourceNotFoundException;
import com.bitnationcode.topflies.model.Fly;
import com.bitnationcode.topflies.repository.IFlyRepository;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class FlyService implements IFlyService {

    private IFlyRepository flyRepository;

    public FlyService(IFlyRepository flyRepository) {
        this.flyRepository = flyRepository;
    }

    @Override
    public List<Fly> getFlies() {
        return flyRepository.findAll(Sort.by(Sort.Direction.ASC, "name"));
    }

    @Override
    @Transactional(readOnly = false)
    public Fly saveFly(Fly fly) {
        return flyRepository.save(fly);
    }

    @Override
    public Fly findById(Long flyId) throws ResourceNotFoundException {
        return flyRepository.findById(flyId)
                .orElseThrow(() -> new ResourceNotFoundException("Fly", "id", flyId));
    }

    @Override
    @Transactional(readOnly = false)
    public Fly updateFly(Fly fly) throws ResourceNotFoundException {
        Fly existingFly = flyRepository.findById(fly.getFlyId())
                .orElseThrow(() -> new ResourceNotFoundException("Fly", "id", fly.getFlyId()));

        //TODO which fields are to be updated
        existingFly.setName(fly.getName());
        return saveFly(existingFly);
    }

    @Override
    public void deleteFly(Long flyId) throws ResourceNotFoundException {
        Fly existingFly = flyRepository.findById(flyId)
                .orElseThrow(() -> new ResourceNotFoundException("Fly", "id", flyId));

        flyRepository.delete(existingFly);
    }
}
