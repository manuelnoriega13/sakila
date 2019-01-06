package com.manoriega.sakila;

import com.manoriega.sakila.dao.IActorDao;
import com.manoriega.sakila.dao.IFilmDao;
import com.manoriega.sakila.entities.inventory.Film;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SakilaApplicationTests {

    @Autowired
    private IActorDao actorDao;

    @Autowired
    private IFilmDao filmDao;

    @Test
    public void contextLoads() {

        List<Film> filmList = filmDao.findAll();
    }

}

