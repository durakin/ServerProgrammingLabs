package com.github.durakin.serverprogramming.lab4.entity;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ListingId implements Serializable {
    private static final long serialVersionUID = -3163324520296167696L;
    @Column(name = "station_id", nullable = false)
    private Integer stationId;
    @Column(name = "commodity_id", nullable = false)
    private Integer commodityId;

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    public Integer getStationId() {
        return stationId;
    }

    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(commodityId, stationId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ListingId entity = (ListingId) o;
        return Objects.equals(this.commodityId, entity.commodityId) &&
                Objects.equals(this.stationId, entity.stationId);
    }
}