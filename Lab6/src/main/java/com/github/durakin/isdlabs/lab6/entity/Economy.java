package com.github.durakin.isdlabs.lab6.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "economies")
@Entity
public class Economy {
    @Id
    @Column(name = "primary_economy_id", nullable = false)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}