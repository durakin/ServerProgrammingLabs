package com.github.durakin.serverprogramming.lab4.service;

import com.github.durakin.serverprogramming.lab4.entity.Commander;

import java.util.List;

public interface CommanderService {

    Integer add(Commander commander);

    List<Commander> FindByFactionName(String name);

    List<Commander> FindByAllegianceName(String allegiance);
}
