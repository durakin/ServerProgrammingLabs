package com.github.durakin.serverprogramming.lab4;


import com.github.durakin.serverprogramming.lab4.entity.Allegiance;
import com.github.durakin.serverprogramming.lab4.entity.Commander;
import com.github.durakin.serverprogramming.lab4.entity.Faction;
import com.github.durakin.serverprogramming.lab4.service.AllegianceService;
import com.github.durakin.serverprogramming.lab4.service.CommanderService;
import com.github.durakin.serverprogramming.lab4.service.FactionService;
import com.github.durakin.serverprogramming.lab4.service.StationService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.persistence.EntityManagerFactory;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Program {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        var factionService = context.getBean("factionServiceImpl", FactionService.class);
        var  commanderService = context.getBean("commanderServiceImpl", CommanderService.class);
        var allegianceService = context.getBean("allegianceServiceImpl", AllegianceService.class);
        var stationService = context.getBean("stationServiceImpl", StationService.class);

        var add = false;
        var showStatic = false;
        var showNew = false;
        var delete = true;

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