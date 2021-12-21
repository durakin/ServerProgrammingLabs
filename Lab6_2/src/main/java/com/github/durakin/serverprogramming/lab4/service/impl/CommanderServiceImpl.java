package com.github.durakin.serverprogramming.lab4.service.impl;

import com.github.durakin.serverprogramming.lab4.entity.Commander;
import com.github.durakin.serverprogramming.lab4.repository.models.CommanderAllegiance;
import com.github.durakin.serverprogramming.lab4.repository.CommanderCriteriaRepository;
import com.github.durakin.serverprogramming.lab4.repository.CommanderRepository;
import com.github.durakin.serverprogramming.lab4.service.CommanderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CommanderServiceImpl implements CommanderService {
    private final CommanderCriteriaRepository commanderCriteriaRepository;

    @Autowired
    private CommanderRepository commanderRepository;

    @Override
    @Transactional
    public Integer add(Commander commander) {
        this.commanderRepository.save(commander);
        return commander.getId();
    }

    @Override
    public List<Commander> FindByFactionName(String name) {
        return commanderCriteriaRepository.FindByFactionName(name);
    }

    @Override
    public List<Commander> FindByAllegianceName(String allegiance) {
        return commanderCriteriaRepository.FindByAllegianceName(allegiance);
    }

    @Override
    public List<CommanderAllegiance> FindCommandersAllegiance() {
        return  this.commanderCriteriaRepository.FindCommandersAllegiance();
    }

    public CommanderServiceImpl(CommanderCriteriaRepository commanderCriteriaRepository) {
        this.commanderCriteriaRepository = commanderCriteriaRepository;
    }
}
