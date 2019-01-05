package com.manoriega.sakila.dao;

import com.manoriega.sakila.entities.inventory.Actor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IActorDao extends CrudRepository<Actor, Short> {
}
