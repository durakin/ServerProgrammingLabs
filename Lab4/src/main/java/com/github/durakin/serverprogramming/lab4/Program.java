package com.github.durakin.serverprogramming.lab4;


import com.github.durakin.serverprogramming.lab4.entity.Commander;
import com.github.durakin.serverprogramming.lab4.repository.CommanderCriteriaRepository;
import com.github.durakin.serverprogramming.lab4.repository.FactionRepository;
import com.github.durakin.serverprogramming.lab4.service.CommanderService;
import com.github.durakin.serverprogramming.lab4.service.FactionService;
import com.github.durakin.serverprogramming.lab4.service.StationService;
import com.github.durakin.serverprogramming.lab4.service.impl.CommanderServiceImpl;
import com.github.durakin.serverprogramming.lab4.service.impl.FactionServiceImpl;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Program {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        var reader = new BufferedReader(new InputStreamReader(System.in));
        var service = context.getBean("stationServiceImpl", StationService.class);
        // var data = service.findById(ConsoleInput.CheckedIntInput("Enter required apparel ID ", reader));
        //  System.out.println(data != null ? data : "Element not found ");
        var emf = context.getBean("entityManagerFactory", EntityManagerFactory.class);
        FactionService factionService = context.getBean("factionServiceImpl", FactionService.class);

        /*
        CriteriaBuilder cb = em.getCriteriaBuilder();

        CriteriaQuery<Commander> personCriteria = cb.createQuery(Commander.class);
        Root<Commander> personRoot = personCriteria.from(Commander.class);
        personCriteria.select(personRoot);
        em.createQuery(personCriteria)
                .getResultList()
                .forEach(System.out::println);

         */
        var commanderRepository = new CommanderCriteriaRepository(emf);
        CommanderService  commanderService = context.getBean("commanderServiceImpl", CommanderService.class);
        //new CommanderServiceImpl(commanderRepository);
        System.out.println();
        commanderService.FindByFactionName("10 Delta Coronae Borealis Central Services").forEach(System.out::println);
        System.out.println();
        commanderService.FindByAllegianceName("Independent").forEach(System.out::println);
        System.out.println();
        commanderService.FindByAllegianceName("Pilots Federation").forEach(System.out::println);
        System.out.println();
        // INSERT INTO factions VALUES (default, 'New player faction', 414, 7, 128, true);
        var newCommander = new Commander();
        newCommander.setName("Player created with ORM");
        newCommander.setFaction(factionService.findByName("New player faction"));
        commanderService.add(newCommander);
        commanderService.FindByFactionName("New player faction").forEach(System.out::println);
        System.out.println();
        context.close();
        System.exit(0);

        /*

        boolean lastMenuIteration = false;
        while (!lastMenuIteration) {
            System.out.println("" +
                    "1. Print info about all apparels" + '\n' +
                    "2. Print info about single apparel by ID" + '\n' +
                    "3. Print apparels with price lower than requested" + '\n' +
                    "4. Delete element by index" + '\n' +
                    "5. Edit element" + '\n' +
                    "6. Add element" + '\n' +
                    "7. Quit" + '\n'
            );

            var cmdNumber = ConsoleInput.CheckedIntInput("Enter required command number (1-7) ", reader,
                    (input) -> 1 <= input && input <= 7);

            switch (cmdNumber) {
                case 1 -> {
                    var data = service.findAll();
                    for (var i : data) {
                        System.out.println(i);
                    }
                }
                case 2 -> {
                    var data = service.findById(ConsoleInput.CheckedIntInput("Enter required apparel ID ", reader));
                    System.out.println(data != null ? data : "Element not found ");
                }
                case 3 -> {
                    var data = service.findByMaxPrice(ConsoleInput.CheckedDoubleInput("Enter required price ", reader));
                    System.out.println("Found " + data.size() + " elements");
                    for (var i : data) {
                        System.out.println(i);
                    }
                }
                case 4 -> {
                    var result = service.delete(ConsoleInput.CheckedIntInput("Enter id of the element to delete ", reader));
                    System.out.println(result ? "Successfully deleted " : "Element not found ");
                }
                case 5 -> {
                    var id = ConsoleInput.CheckedIntInput("Enter id of the element to edit ", reader);
                    var element = service.findById(id);
                    if (element == null) {
                        System.out.println("Element not found");
                        break;
                    }
                    Double newPrice = null;
                    Integer newInStock = null;
                    var lastSubMenuIteration = false;
                    while (!lastSubMenuIteration) {
                        System.out.println("Element\n" + element);
                        System.out.println((newPrice == null ? "" : "New price will be " + newPrice + '\n') + (newInStock == null ? "" : "New number in stock will be " + newInStock + '\n'));
                        System.out.println("1. Edit price\n" +
                                "2. Edit number in stock\n" +
                                "3. Finish editing\n" +
                                "4. Cancel editing\n"
                        );
                        var subCmdNumber = ConsoleInput.CheckedIntInput("Enter required command number (1-4) ", reader,
                                (input) -> 1 <= input && input <= 4);
                        switch (subCmdNumber) {
                            case 1 -> newPrice = ConsoleInput.CheckedDoubleInput("Enter new apparel's price", reader);
                            case 2 -> newInStock = ConsoleInput.CheckedIntInput("Enter new number of apparels in stock", reader);
                            case 3 -> lastSubMenuIteration = true;
                            case 4 -> {
                                newInStock = null;
                                newPrice = null;
                            }
                        }
                    }
                    System.out.println(service.update(id, newInStock, newPrice) ? "Updated" : "Something went wrong");

                }
                case 6 -> {
                    var apparel = new Apparel();
                    apparel.setApparelType(ConsoleInput.CheckedStringInput("Enter apparel's type ", reader));
                    var sex = ConsoleInput.CheckedStringInput("Enter apparel's sex (M, F or Uni) ", reader, Program::ApparelsSexChecker);
                    apparel.setSex(sex.length() == 1 ? sex : null);
                    var size = ConsoleInput.CheckedStringInput("Enter apparel's size (- for non-sized items) ", reader);
                    apparel.setSize(!size.equals("-") ? size : null);
                    var inStock = ConsoleInput.CheckedIntInput("Enter number of items in stock ", reader, (integer -> integer > 0));
                    apparel.setInStock(inStock);
                    var price = ConsoleInput.CheckedDoubleInput("Enter price of the item ", reader, (aDouble -> aDouble >= 0));
                    apparel.setPrice(price);
                    var id = service.add(apparel);
                    System.out.println("Apparel added " + service.findById(id));
                }
                case 7 -> lastMenuIteration = true;

            }

        }

        System.out.println();
        context.close();
        System.exit(0);

    }

    private static boolean ApparelsSexChecker(String string) {
        return string.equals("M") || string.equals("F") || string.equals("Uni");


         */

    }
}