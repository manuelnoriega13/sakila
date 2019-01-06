package com.manoriega.sakila.dao;

import com.manoriega.sakila.entities.inventory.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IActorDao extends JpaRepository<Actor, Short> {
}
