package com.manoriega.sakila.dao;

import com.manoriega.sakila.entities.inventory.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryDao extends JpaRepository<Category, Long> {
}
