package com.manoriega.sakila.entities.inventory;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
@Entity
@Table(name = "inventory")
public class Inventory {

    @Id
    @Column(name = "inventory_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "film_id")
    private Film film;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "film_id")
    private List<FilmText> filmText;

    @Column(name = "last_update")
    private Date lastUpdate;
}
