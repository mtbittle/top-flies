package com.bitnationcode.topflies.service;

import com.bitnationcode.topflies.model.River;
import com.bitnationcode.topflies.repository.IRiverRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Michael
 * @date 11/3/2019
 **/
@Service
public class RiverService implements IRiverService {

    private IRiverRepository riverRepository;

    public RiverService(IRiverRepository riverRepository) {
        this.riverRepository = riverRepository;
    }

    @Override
    public List<River> getAllRivers() {
        return riverRepository.findAll(Sort.by(Sort.Direction.ASC, "name"));
    }
}
