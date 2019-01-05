package com.manoriega.sakila.entities.inventory;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Set;
import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "film")
public class Film {

    @Id
    @Column(name = "film_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

//    @ManyToMany(fetch = FetchType.EAGER)
//    @JoinTable(
//            name = "film_actor",
//            joinColumns = {@JoinColumn(name = "actor_id")},
//            inverseJoinColumns = {@JoinColumn(name = "film_id")}
//    )
//    private List<Actor> actorList;
//
//    @ManyToMany(fetch = FetchType.EAGER)
//    @JoinTable(
//            name = "film_actor",
//            joinColumns = {@JoinColumn(name = "actor_id")},
//            inverseJoinColumns = {@JoinColumn(name = "film_id")}
//    )
//    private List<Film> filmList;

    @OneToMany(mappedBy = "actor", cascade = CascadeType.ALL)
    private Set<FilmActor> filmActors;
}
