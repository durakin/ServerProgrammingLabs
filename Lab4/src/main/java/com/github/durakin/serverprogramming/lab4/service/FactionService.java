package com.github.durakin.serverprogramming.lab4.service;

import com.github.durakin.serverprogramming.lab4.entity.Faction;

public interface FactionService {
    Faction findById(Integer id);
    Faction findByName(String name);
    void deleteByName(String name);
    Integer add(Faction faction);
}
