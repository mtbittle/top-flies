package com.bitnationcode.topflies.service;

import com.bitnationcode.topflies.model.State;

import java.util.List;

/**
 * @author Michael
 * @date 11/3/2019
 **/
public interface IStateService {

    List<State> findAllStates();

    State saveState(State state);

    List<State> findAllStatesByCountry(String countryAbbreviation);
}
