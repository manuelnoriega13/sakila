package com.manoriega.sakila.dao.inventory;

import com.manoriega.sakila.entities.inventory.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFilmDao extends JpaRepository<Film, Long> {
}
