package com.github.durakin.serverprogramming.lab4.service;

import com.github.durakin.serverprogramming.lab4.entity.Commander;

import java.util.List;

public interface CommanderService {

    public Integer add(Commander commander);

    public List<Commander> FindByFactionName(String name);

    public List<Commander> FindByAllegianceName(String allegiance);

}
