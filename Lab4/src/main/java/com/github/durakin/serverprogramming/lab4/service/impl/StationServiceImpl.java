package com.github.durakin.serverprogramming.lab4.service.impl;

import com.github.durakin.serverprogramming.lab4.entity.Station;
import com.github.durakin.serverprogramming.lab4.repository.StationRepository;
import com.github.durakin.serverprogramming.lab4.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StationServiceImpl implements StationService {
    @Autowired
    private StationRepository stationRepository;

    @Override
    public Station findById(Integer id) {
        return this.stationRepository.findById(id).orElse(null);
    }
}
