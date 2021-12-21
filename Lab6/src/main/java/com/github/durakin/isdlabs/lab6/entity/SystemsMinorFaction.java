package com.github.durakin.isdlabs.lab6.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "systems_minor_factions")
@Entity
public class SystemsMinorFaction {
    @EmbeddedId
    private SystemsMinorFactionId id;

    @Column(name = "happiness_id")
    private Integer happinessId;

    @Column(name = "influence")
    private Double influence;

    public Double getInfluence() {
        return influence;
    }

    public void setInfluence(Double influence) {
        this.influence = influence;
    }

    public Integer getHappinessId() {
        return happinessId;
    }

    public void setHappinessId(Integer happinessId) {
        this.happinessId = happinessId;
    }

    public SystemsMinorFactionId getId() {
        return id;
    }

    public void setId(SystemsMinorFactionId id) {
        this.id = id;
    }
}