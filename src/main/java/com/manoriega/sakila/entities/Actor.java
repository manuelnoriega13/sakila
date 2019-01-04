package com.manoriega.sakila.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "actor")
public class Actor {

    @Column(name = "actor_id")
    private Short id;
}
