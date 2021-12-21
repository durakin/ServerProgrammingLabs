package com.github.durakin.isdlabs.lab6.entity;

import javax.persistence.*;

@Table(name = "listings", indexes = {
        @Index(name = "listings_demand_commodity_id_index", columnList = "demand, commodity_id")
})
@Entity
public class Listing {
    @EmbeddedId
    private ListingId id;

    @ManyToOne
    @MapsId("stationId")
    @JoinColumn(name = "station_id")
    Station station;

    @ManyToOne
    @MapsId("commodityId")
    @JoinColumn(name = "commodity_id")
    Commodity commodity;

    @Column(name = "sell_price")
    private Integer sellPrice;

    @Column(name = "supply")
    private Integer supply;

    @Column(name = "buy_price")
    private Integer buyPrice;

    @Column(name = "demand")
    private Integer demand;

    public Integer getDemand() {
        return demand;
    }

    public void setDemand(Integer demand) {
        this.demand = demand;
    }

    public Integer getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(Integer buyPrice) {
        this.buyPrice = buyPrice;
    }

    public Integer getSupply() {
        return supply;
    }

    public void setSupply(Integer supply) {
        this.supply = supply;
    }

    public Integer getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(Integer sellPrice) {
        this.sellPrice = sellPrice;
    }

    public ListingId getId() {
        return id;
    }

    public void setId(ListingId id) {
        this.id = id;
    }
}