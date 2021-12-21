package com.github.durakin.serverprogramming.lab4.service.impl;

import com.github.durakin.serverprogramming.lab4.entity.Allegiance;
import com.github.durakin.serverprogramming.lab4.repository.AllegianceRepository;
import com.github.durakin.serverprogramming.lab4.service.AllegianceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AllegianceServiceImpl implements AllegianceService {
    @Autowired
    private AllegianceRepository allegianceRepository;

    @Override
    public Allegiance FindByAllegiance(String allegiance) {
        return this.allegianceRepository.findByAllegiance(allegiance).orElse(null);
    }
}
