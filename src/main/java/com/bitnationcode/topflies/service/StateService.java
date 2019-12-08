package com.bitnationcode.topflies.service;

import com.bitnationcode.topflies.model.State;
import com.bitnationcode.topflies.repository.IStateRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Michael
 * @date 11/3/2019
 **/
@Service
public class StateService implements IStateService {

    private IStateRepository stateRepository;

    public StateService(IStateRepository stateRepository) {
        this.stateRepository = stateRepository;
    }

    @Override
    public List<State> getAllStates() {
        return stateRepository.findAll(Sort.by(Sort.Direction.ASC, "abbreviation"));
    }

    @Override
    public State saveState(State state) {
        return stateRepository.save(state);
    }
}
