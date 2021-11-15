package com.github.durakin.serverprogramming.lab4.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "allegiances")
@Entity
public class Allegiance {

    @Id
    @Column(name = "allegiance_id", nullable = false)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}