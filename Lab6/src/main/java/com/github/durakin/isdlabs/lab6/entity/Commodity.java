package com.github.durakin.isdlabs.lab6.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Set;

@Table(name = "commodities")
@Entity
public class Commodity {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "ed_id")
    private Integer edId;

    @OneToMany(mappedBy = "commodity")
    Set<Listing> listings;

    @Lob
    @Type(type = "org.hibernate.type.TextType")
    @Column(name = "name")
    private String name;

    @Lob
    @Column(name = "category")
    private String category;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEdId() {
        return edId;
    }

    public void setEdId(Integer edId) {
        this.edId = edId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}