package com.bitnationcode.topflies.service;

import com.bitnationcode.topflies.model.Season;
import com.bitnationcode.topflies.repository.ISeasonRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Michael
 * @date 11/3/2019
 **/
@Service
public class SeasonService implements ISeasonService {

    private ISeasonRepository seasonRepository;

    public SeasonService(ISeasonRepository seasonRepository) {
        this.seasonRepository = seasonRepository;
    }

    @Override
    public List<Season> getAllSeasons() {
        return seasonRepository.findAll(Sort.by(Sort.Direction.ASC, "name"));
    }
}
