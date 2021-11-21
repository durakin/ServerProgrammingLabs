package com.github.durakin.serverprogramming.lab4.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;

@Table(name = "governments")
@Entity
public class Government {
    @Id
    @Column(name = "government_id", nullable = false)
    private Integer id;

    @Lob
    @Type(type = "org.hibernate.type.TextType")
    @Column(name = "government")
    private String government;

    public String getGovernment() {
        return government;
    }

    public void setGovernment(String government) {
        this.government = government;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return government;
    }

}