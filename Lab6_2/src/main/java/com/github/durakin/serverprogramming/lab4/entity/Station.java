package com.github.durakin.serverprogramming.lab4.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Set;

@Table(name = "stations", indexes = {
        @Index(name = "stations_allegiance_id_index", columnList = "allegiance_id")
})
@Entity
public class Station {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Lob
    @Type(type = "org.hibernate.type.TextType")
    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "station")
    Set<Listing> listings;

    @ManyToOne
    @JoinColumn(name = "system_id")
    private System system;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private StationType type;

    @Column(name = "ed_market_id")
    private Double edMarketId;

    @ManyToOne
    @JoinColumn(name = "allegiance_id")
    private Allegiance allegiance;

    @ManyToOne
    @JoinColumn(name = "controlling_minor_faction_id")
    private Faction controllingMinorFaction;

    @ManyToOne
    @JoinColumn(name = "government_id")
    private Government government;

    @Column(name = "distance_to_star")
    private Integer distanceToStar;

    @Column(name = "has_blackmarket")
    private Boolean hasBlackmarket;

    @Column(name = "has_carrier_administration")
    private Boolean hasCarrierAdministration;

    @Column(name = "has_carrier_vendor")
    private Boolean hasCarrierVendor;

    @Column(name = "has_commodities")
    private Boolean hasCommodities;

    @Column(name = "has_interstellar_factors")
    private Boolean hasInterstellarFactors;

    @Column(name = "has_market")
    private Boolean hasMarket;

    @Column(name = "has_rearm")
    private Boolean hasRearm;

    @Column(name = "has_refuel")
    private Boolean hasRefuel;

    @Column(name = "has_repair")
    private Boolean hasRepair;

    @Column(name = "has_shipyard")
    private Boolean hasShipyard;

    @Column(name = "has_technology_broker")
    private Boolean hasTechnologyBroker;

    @Column(name = "has_universal_cartographics")
    private Boolean hasUniversalCartographics;

    @Column(name = "has_docking")
    private Boolean hasDocking;

    @Column(name = "is_planetary")
    private Boolean isPlanetary;

    @Lob
    @Type(type = "org.hibernate.type.TextType")
    @Column(name = "max_landing_pad_size")
    private String maxLandingPadSize;

    @Column(name = "has_material_trader")
    private Boolean hasMaterialTrader;

    @Column(name = "has_outfitting")
    private Boolean hasOutfitting;

    @Column(name = "body_id")
    private Integer bodyId;

    public Integer getBodyId() {
        return bodyId;
    }

    public void setBodyId(Integer bodyId) {
        this.bodyId = bodyId;
    }

    public Boolean getHasOutfitting() {
        return hasOutfitting;
    }

    public void setHasOutfitting(Boolean hasOutfitting) {
        this.hasOutfitting = hasOutfitting;
    }

    public Boolean getHasMaterialTrader() {
        return hasMaterialTrader;
    }

    public void setHasMaterialTrader(Boolean hasMaterialTrader) {
        this.hasMaterialTrader = hasMaterialTrader;
    }

    public String getMaxLandingPadSize() {
        return maxLandingPadSize;
    }

    public void setMaxLandingPadSize(String maxLandingPadSize) {
        this.maxLandingPadSize = maxLandingPadSize;
    }

    public Boolean getIsPlanetary() {
        return isPlanetary;
    }

    public void setIsPlanetary(Boolean isPlanetary) {
        this.isPlanetary = isPlanetary;
    }

    public Boolean getHasDocking() {
        return hasDocking;
    }

    public void setHasDocking(Boolean hasDocking) {
        this.hasDocking = hasDocking;
    }

    public Boolean getHasUniversalCartographics() {
        return hasUniversalCartographics;
    }

    public void setHasUniversalCartographics(Boolean hasUniversalCartographics) {
        this.hasUniversalCartographics = hasUniversalCartographics;
    }

    public Boolean getHasTechnologyBroker() {
        return hasTechnologyBroker;
    }

    public void setHasTechnologyBroker(Boolean hasTechnologyBroker) {
        this.hasTechnologyBroker = hasTechnologyBroker;
    }

    public Boolean getHasShipyard() {
        return hasShipyard;
    }

    public void setHasShipyard(Boolean hasShipyard) {
        this.hasShipyard = hasShipyard;
    }

    public Boolean getHasRepair() {
        return hasRepair;
    }

    public void setHasRepair(Boolean hasRepair) {
        this.hasRepair = hasRepair;
    }

    public Boolean getHasRefuel() {
        return hasRefuel;
    }

    public void setHasRefuel(Boolean hasRefuel) {
        this.hasRefuel = hasRefuel;
    }

    public Boolean getHasRearm() {
        return hasRearm;
    }

    public void setHasRearm(Boolean hasRearm) {
        this.hasRearm = hasRearm;
    }

    public Boolean getHasMarket() {
        return hasMarket;
    }

    public void setHasMarket(Boolean hasMarket) {
        this.hasMarket = hasMarket;
    }

    public Boolean getHasInterstellarFactors() {
        return hasInterstellarFactors;
    }

    public void setHasInterstellarFactors(Boolean hasInterstellarFactors) {
        this.hasInterstellarFactors = hasInterstellarFactors;
    }

    public Boolean getHasCommodities() {
        return hasCommodities;
    }

    public void setHasCommodities(Boolean hasCommodities) {
        this.hasCommodities = hasCommodities;
    }

    public Boolean getHasCarrierVendor() {
        return hasCarrierVendor;
    }

    public void setHasCarrierVendor(Boolean hasCarrierVendor) {
        this.hasCarrierVendor = hasCarrierVendor;
    }

    public Boolean getHasCarrierAdministration() {
        return hasCarrierAdministration;
    }

    public void setHasCarrierAdministration(Boolean hasCarrierAdministration) {
        this.hasCarrierAdministration = hasCarrierAdministration;
    }

    public Boolean getHasBlackmarket() {
        return hasBlackmarket;
    }

    public void setHasBlackmarket(Boolean hasBlackmarket) {
        this.hasBlackmarket = hasBlackmarket;
    }

    public Integer getDistanceToStar() {
        return distanceToStar;
    }

    public void setDistanceToStar(Integer distanceToStar) {
        this.distanceToStar = distanceToStar;
    }

    public Government getGovernment() {
        return government;
    }

    public void setGovernment(Government government) {
        this.government = government;
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

    public Double getEdMarketId() {
        return edMarketId;
    }

    public void setEdMarketId(Double edMarketId) {
        this.edMarketId = edMarketId;
    }

    public StationType getType() {
        return type;
    }

    public void setType(StationType type) {
        this.type = type;
    }

    public System getSystem() {
        return system;
    }

    public void setSystem(System system) {
        this.system = system;
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
        final StringBuilder sb = new StringBuilder("Station{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", system=").append(system);
        sb.append('}');
        return sb.toString();
    }
}