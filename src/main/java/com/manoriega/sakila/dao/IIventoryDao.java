package com.manoriega.sakila.dao;

import com.manoriega.sakila.entities.inventory.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IIventoryDao extends JpaRepository<Inventory, Long> {
}
