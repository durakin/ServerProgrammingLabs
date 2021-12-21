package com.github.durakin.serverprogramming.lab4;

import java.io.BufferedReader;
import java.util.function.Function;

public class ConsoleInput {

    public static Integer CheckedIntInput(String message, BufferedReader reader, Function<Integer, Boolean> checker) {
        while (true) {
            try {
                System.out.print(message);
                var number = Integer.parseInt(reader.readLine());
                if (!checker.apply(number)) {
                    throw new Exception("Out of required range");
                }
                return number;
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public static Integer CheckedIntInput(String message, BufferedReader reader) {
        return CheckedIntInput(message, reader, (integer) -> true);
    }

    public static Double CheckedDoubleInput(String message, BufferedReader reader, Function<Double, Boolean> checker) {
        while (true) {
            try {
                System.out.print(message);
                var number = Double.parseDouble(reader.readLine());
                if (!checker.apply(number)) {
                    throw new Exception("Out of required range");
                }
                return number;
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public static Double CheckedDoubleInput(String message, BufferedReader reader) {
        return CheckedDoubleInput(message, reader, (aDouble -> true));
    }

    public static String CheckedStringInput(String message, BufferedReader reader, Function<String, Boolean> checker) {
        while (true) {
            try {
                System.out.print(message);
                var string = reader.readLine();
                if (!checker.apply(string)) {
                    throw new Exception("String is empty");
                }
                return string;
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public static String CheckedStringInput(String message, BufferedReader reader) {
        return CheckedStringInput(message, reader, (string) -> string != null && !string.isBlank());
    }

}
