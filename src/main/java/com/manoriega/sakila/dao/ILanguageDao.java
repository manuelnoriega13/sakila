package com.manoriega.sakila.dao;

import com.manoriega.sakila.entities.inventory.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILanguageDao extends JpaRepository<Language, Long> {
}
