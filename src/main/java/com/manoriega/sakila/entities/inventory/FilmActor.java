package com.manoriega.sakila.entities.inventory;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "film_actor")
public class FilmActor implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "actor_id")
    private Actor actor;

    @Id
    @ManyToOne
    @JoinColumn(name = "film_id")
    private Film film;

    @Column(name = "last_update")
    private Date lastUpdate;
}
