package com.manoriega.sakila.dao.inventory;

import com.manoriega.sakila.entities.inventory.FilmText;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFilmTextDao extends JpaRepository<FilmText, Long> {
}
