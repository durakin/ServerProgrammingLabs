package com.github.durakin.isdlabs.lab6.entity;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class SystemsMinorFactionId implements Serializable {
    private static final long serialVersionUID = 4513988797952248522L;
    @Column(name = "system_id", nullable = false)
    private Integer systemId;
    @Column(name = "minor_faction_id", nullable = false)
    private Integer minorFactionId;

    public Integer getMinorFactionId() {
        return minorFactionId;
    }

    public void setMinorFactionId(Integer minorFactionId) {
        this.minorFactionId = minorFactionId;
    }

    public Integer getSystemId() {
        return systemId;
    }

    public void setSystemId(Integer systemId) {
        this.systemId = systemId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(systemId, minorFactionId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        SystemsMinorFactionId entity = (SystemsMinorFactionId) o;
        return Objects.equals(this.systemId, entity.systemId) &&
                Objects.equals(this.minorFactionId, entity.minorFactionId);
    }
}