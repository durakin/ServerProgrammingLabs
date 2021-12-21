package com.github.durakin.serverprogramming.lab4;


import com.github.durakin.serverprogramming.lab4.entity.Commander;
import com.github.durakin.serverprogramming.lab4.entity.Faction;
import com.github.durakin.serverprogramming.lab4.repository.models.CommanderAllegiance;
import com.github.durakin.serverprogramming.lab4.service.AllegianceService;
import com.github.durakin.serverprogramming.lab4.service.CommanderService;
import com.github.durakin.serverprogramming.lab4.service.FactionService;
import com.github.durakin.serverprogramming.lab4.service.StationService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Program {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        var factionService = context.getBean("factionServiceImpl", FactionService.class);
        var commanderService = context.getBean("commanderServiceImpl", CommanderService.class);
        var allegianceService = context.getBean("allegianceServiceImpl", AllegianceService.class);
        var stationService = context.getBean("stationServiceImpl", StationService.class);

        var add = false;
        var showStatic = true;
        var showNew = false;
        var delete = false;
        var showCustomClass = false;

        if (add) {
            var faction = new Faction();
            faction.setName("New player faction");
            faction.setAllegiance(allegianceService.FindByAllegiance("Pilots Federation"));
            factionService.add(faction);

            var newCommander = new Commander();
            newCommander.setName("Player created with ORM");
            newCommander.setFaction(factionService.findByName("New player faction"));
            commanderService.add(newCommander);
        }

        if (showStatic) {
            commanderService.FindByFactionName("10 Delta Coronae Borealis Central Services").forEach(System.out::println);
            System.out.println();
            commanderService.FindByAllegianceName("Independent").forEach(System.out::println);
            System.out.println();
            commanderService.FindByAllegianceName("Pilots Federation").forEach(System.out::println);
            System.out.println();

        }

        if (showCustomClass) {
            commanderService.FindCommandersAllegiance().forEach(System.out::println);
        }

        if (showNew) {
            commanderService.FindByFactionName("New player faction").forEach(System.out::println);
            System.out.println();

        }

        if (delete) {
            factionService.deleteByName("New player faction");
        }

        context.close();
        System.exit(0);
    }
}