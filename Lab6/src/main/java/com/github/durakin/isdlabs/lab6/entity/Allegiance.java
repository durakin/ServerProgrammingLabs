package com.github.durakin.isdlabs.lab6.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;

@Table(name = "allegiances")
@Entity
public class Allegiance {
    @Id
    @Column(name = "allegiance_id", nullable = false)
    private Integer id;

    @Lob
    @Type(type = "org.hibernate.type.TextType")
    @Column(name = "allegiance")
    private String allegiance;

    public String getAllegiance() {
        return allegiance;
    }

    public void setAllegiance(String allegiance) {
        this.allegiance = allegiance;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return allegiance;
    }
}