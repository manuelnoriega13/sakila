package com.manoriega.sakila.entities.inventory;

import lombok.Getter;
import lombok.Setter;

import java.util.*;
import java.util.stream.Collectors;
import javax.persistence.*;

//3
@Getter
@Setter
@Entity
@Table(name = "film")
public class Film {

    public enum Rating {
        G,
        PG,
        PG_13,
        R,
        NC_17
    }

    @Id
    @Column(name = "film_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "release_year")
    private Integer releaseYear;

    @ManyToOne
    @JoinColumn(name = "language_id")
    private Language language;

    @ManyToOne
    @JoinColumn(name = "original_language_id")
    private Language originalLanguaje;

    @Column(name = "rental_duration")
    private Short rentalDuration;

    @Column(name = "rental_rate")
    private Double rentalRate;

    @Column(name = "length")
    private Short length;

    @Column(name = "replacement_cost")
    private Double replacementCost;

    @Enumerated(EnumType.STRING)
    private Rating rating;

    @Column(name = "last_update")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdate;

    @Column(name = "special_features")
    private String specialFeatures;

    @OneToMany(mappedBy = "film", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<FilmActor> filmActors;

    @OneToMany(mappedBy = "film", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<FilmCategory> filmCategories;

    public Set<String> specialFeatures() {
        return (null == specialFeatures) ? Collections.emptySet() :
                Arrays.stream(specialFeatures.split("_")).map(String::valueOf).collect(Collectors.toSet());

    }


}
