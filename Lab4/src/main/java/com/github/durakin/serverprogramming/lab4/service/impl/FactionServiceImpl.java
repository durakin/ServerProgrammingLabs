package com.github.durakin.serverprogramming.lab4.service.impl;

import com.github.durakin.serverprogramming.lab4.entity.Faction;
import com.github.durakin.serverprogramming.lab4.repository.FactionRepository;
import com.github.durakin.serverprogramming.lab4.service.FactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FactionServiceImpl implements FactionService {
    @Autowired
    private FactionRepository factionRepository;

    @Override
    public Faction findById(Integer id) {
        return this.factionRepository.findById(id).orElse(null);
    }

    @Override
    public Faction findByName(String name) {
        return this.factionRepository.findByName(name).orElse(null);
    }

    @Override
    public void deleteByName(String name) {
        this.factionRepository.deleteByName(name);
    }

    @Override
    @Transactional
    public Integer add(Faction faction) {
        this.factionRepository.save(faction);
        return faction.getId();
    }
}
