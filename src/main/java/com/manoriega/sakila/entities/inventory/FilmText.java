package com.manoriega.sakila.entities.inventory;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "film_text")
public class FilmText {

    @Id
    @Column(name = "film_id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;
}
