package com.bitnationcode.topflies.service;

import com.bitnationcode.topflies.controller.home.SearchForm;
import com.bitnationcode.topflies.exceptions.ResourceNotFoundException;
import com.bitnationcode.topflies.model.Fly;
import com.bitnationcode.topflies.model.FlyType;
import com.bitnationcode.topflies.querydsl.FlyPredicateBuilder;
import com.bitnationcode.topflies.repository.FlyIdAndName;
import com.bitnationcode.topflies.repository.IFlyRepository;
import com.bitnationcode.topflies.repository.IFlyTypeRepository;
import org.reflections.vfs.Vfs;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class FlyService implements IFlyService {

    private IFlyRepository flyRepository;
    private IFlyTypeRepository flyTypeRepository;

    public FlyService(IFlyRepository flyRepository, IFlyTypeRepository flyTypeRepository) {
        this.flyRepository = flyRepository;
        this.flyTypeRepository = flyTypeRepository;
    }

    @Override
    public List<Fly> getAllFlies() {
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

    @Override
    public List<FlyIdAndName> getFlyIdAndNames() {
        return flyRepository.findAllProjectedBy();
    }

    @Override
    public List<FlyType> getAllFlyTypes() {
        return flyTypeRepository.findAll(Sort.by(Sort.Direction.ASC, "name"));
    }

    @Override
    public Page<Fly> findBySearchParams(SearchForm form, Pageable pageable) {
        return flyRepository.findAll(FlyPredicateBuilder.build(form), pageable);
    }
}
