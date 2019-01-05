package com.manoriega.sakila.dao;

import com.manoriega.sakila.entities.inventory.Film;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFilmDao extends CrudRepository<Film, Long> {
}
