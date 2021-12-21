package com.github.durakin.isdlabs.lab6.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;

@Table(name = "factions")
@Entity
public class Faction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Lob
    @Type(type = "org.hibernate.type.TextType")
    @Column(name = "name")
    private String name;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "home_system_id")
    private java.lang.System homeSystem;

    @ManyToOne
    @JoinColumn(name = "allegiance_id")
    private Allegiance allegiance;

    @ManyToOne
    @JoinColumn(name = "government_id")
    private Government government;

    @Column(name = "is_player_faction")
    private Boolean isPlayerFaction;

    public Boolean getIsPlayerFaction() {
        return isPlayerFaction;
    }

    public void setIsPlayerFaction(Boolean isPlayerFaction) {
        this.isPlayerFaction = isPlayerFaction;
    }

    public Government getGovernment() {
        return government;
    }

    public void setGovernment(Government government) {
        this.government = government;
    }

    public Allegiance getAllegiance() {
        return allegiance;
    }

    public void setAllegiance(Allegiance allegiance) {
        this.allegiance = allegiance;
    }

    public java.lang.System getHomeSystem() {
        return homeSystem;
    }

    public void setHomeSystem(java.lang.System homeSystem) {
        this.homeSystem = homeSystem;
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
        final StringBuilder sb = new StringBuilder("Faction ");
        sb.append(name);
        sb.append(" with allegiance ").append(allegiance);
        sb.append(" and ").append(government);
        sb.append(" government");
        return sb.toString();
    }
}