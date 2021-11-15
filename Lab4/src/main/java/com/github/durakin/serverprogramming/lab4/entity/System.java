package com.github.durakin.serverprogramming.lab4.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;

@Table(name = "systems")
@Entity
public class System {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "allegiance_id")
    private Allegiance allegiance;

    @ManyToOne
    @JoinColumn(name = "controlling_minor_faction_id")
    private Faction controllingMinorFaction;

    @Column(name = "ed_system_address")
    private Double edSystemAddress;

    @Column(name = "edsm_id")
    private Integer edsmId;

    @ManyToOne
    @JoinColumn(name = "government_id")
    private Government government;

    @Column(name = "is_populated")
    private Boolean isPopulated;

    @Lob
    @Type(type = "org.hibernate.type.TextType")
    @Column(name = "name")
    private String name;

    @Column(name = "needs_permit", nullable = false)
    private Boolean needsPermit = false;

    @Column(name = "population")
    private Double population;

    @Lob
    @Type(type = "org.hibernate.type.TextType")
    @Column(name = "power")
    private String power;

    @ManyToOne
    @JoinColumn(name = "power_state_id")
    private PowerState powerState;

    @ManyToOne
    @JoinColumn(name = "primary_economy_id")
    private Economy primaryEconomy;

    @ManyToOne
    @JoinColumn(name = "reserve_type_id")
    private ReserveType reserveType;

    @ManyToOne
    @JoinColumn(name = "security_id")
    private Security security;

    @Column(name = "x")
    private Double x;

    @Column(name = "y")
    private Double y;

    @Column(name = "z")
    private Double z;

    public Double getZ() {
        return z;
    }

    public void setZ(Double z) {
        this.z = z;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Security getSecurity() {
        return security;
    }

    public void setSecurity(Security security) {
        this.security = security;
    }

    public ReserveType getReserveType() {
        return reserveType;
    }

    public void setReserveType(ReserveType reserveType) {
        this.reserveType = reserveType;
    }

    public Economy getPrimaryEconomy() {
        return primaryEconomy;
    }

    public void setPrimaryEconomy(Economy primaryEconomy) {
        this.primaryEconomy = primaryEconomy;
    }

    public PowerState getPowerState() {
        return powerState;
    }

    public void setPowerState(PowerState powerState) {
        this.powerState = powerState;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public Double getPopulation() {
        return population;
    }

    public void setPopulation(Double population) {
        this.population = population;
    }

    public Boolean getNeedsPermit() {
        return needsPermit;
    }

    public void setNeedsPermit(Boolean needsPermit) {
        this.needsPermit = needsPermit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getIsPopulated() {
        return isPopulated;
    }

    public void setIsPopulated(Boolean isPopulated) {
        this.isPopulated = isPopulated;
    }

    public Government getGovernment() {
        return government;
    }

    public void setGovernment(Government government) {
        this.government = government;
    }

    public Integer getEdsmId() {
        return edsmId;
    }

    public void setEdsmId(Integer edsmId) {
        this.edsmId = edsmId;
    }

    public Double getEdSystemAddress() {
        return edSystemAddress;
    }

    public void setEdSystemAddress(Double edSystemAddress) {
        this.edSystemAddress = edSystemAddress;
    }

    public Faction getControllingMinorFaction() {
        return controllingMinorFaction;
    }

    public void setControllingMinorFaction(Faction controllingMinorFaction) {
        this.controllingMinorFaction = controllingMinorFaction;
    }

    public Allegiance getAllegiance() {
        return allegiance;
    }

    public void setAllegiance(Allegiance allegiance) {
        this.allegiance = allegiance;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}