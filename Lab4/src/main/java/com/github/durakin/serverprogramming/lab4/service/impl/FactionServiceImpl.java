package com.github.durakin.serverprogramming.lab4.service.impl;

import com.github.durakin.serverprogramming.lab4.entity.Faction;
import com.github.durakin.serverprogramming.lab4.entity.Station;
import com.github.durakin.serverprogramming.lab4.repository.FactionRepository;
import com.github.durakin.serverprogramming.lab4.repository.StationRepository;
import com.github.durakin.serverprogramming.lab4.service.FactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FactionServiceImpl implements FactionService {
    @Autowired
    private FactionRepository factionRepository;

    @Override
    public Faction findById(Integer id) {
        return this.factionRepository.findById(id).orElse(null);
    }
}
