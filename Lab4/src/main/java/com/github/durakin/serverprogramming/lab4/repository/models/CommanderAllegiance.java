package com.github.durakin.serverprogramming.lab4.repository.models;

public class CommanderAllegiance {
    private String name;
    private String allegiance;

    public CommanderAllegiance(String name, String allegiance) {
        this.name = name;
        this.allegiance = allegiance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAllegiance() {
        return allegiance;
    }

    public void setAllegiance(String allegiance) {
        this.allegiance = allegiance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Commander ");
        sb.append(name);
        sb.append(", allegiance ").append(allegiance);
        return sb.toString();
    }
}
