package com.bitnationcode.topflies.service;

import com.bitnationcode.topflies.model.Region;
import com.bitnationcode.topflies.repository.IRegionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Michael
 * @date 11/3/2019
 **/
@Service
public class RegionService implements IRegionService {

    private IRegionRepository regionRepository;

    public RegionService(IRegionRepository regionRepository) {
        this.regionRepository = regionRepository;
    }

    @Override
    public List<Region> getAllRegions() {
        return regionRepository.findAll();
    }
}
