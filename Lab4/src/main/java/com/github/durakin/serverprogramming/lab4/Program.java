package com.github.durakin.serverprogramming.lab4;

import com.github.durakin.serverprogramming.lab4.entity.Apparel;
import com.github.durakin.serverprogramming.lab4.service.ApparelService;
import com.github.durakin.serverprogramming.lab4.service.StationService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Program {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        var reader = new BufferedReader(new InputStreamReader(System.in));
        var service = context.getBean("stationServiceImpl", StationService.class);
        var data = service.findById(ConsoleInput.CheckedIntInput("Enter required apparel ID ", reader));
        System.out.println(data != null ? data : "Element not found ");
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