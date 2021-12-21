package com.github.durakin.isdlabs.lab6.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;

@Table(name = "commanders")
@Entity
public class Commander {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Lob
    @Type(type = "org.hibernate.type.TextType")
    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "faction_id")
    private Faction faction;

    public Faction getFaction() {
        return faction;
    }

    public void setFaction(Faction faction) {
        this.faction = faction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Commander ");
        sb.append(name);
        sb.append(" from ").append(faction);
        return sb.toString();
    }
}