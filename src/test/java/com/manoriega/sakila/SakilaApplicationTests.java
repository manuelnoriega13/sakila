package com.manoriega.sakila;

import com.manoriega.sakila.dao.*;
import com.manoriega.sakila.entities.inventory.*;
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

    @Autowired
    private ILanguageDao languageDao;

    @Autowired
    private ICategoryDao categoryDao;

    @Autowired
    private IFilmTextDao filmTextDao;

    @Autowired
    private IIventoryDao iIventoryDao;

    @Test
    public void contextLoads() {

//        List<Inventory> inventories = iIventoryDao.findAll();
//        List<FilmText> filmTextList = filmTextDao.findAll();
//        List<Category> categoryList = categoryDao.findAll();
//        List<Language> languagList = languageDao.findAll();
//        List<Actor> actorList = actorDao.findAll();
//        List<Film> filmList = filmDao.findAll();
//        List<FilmCategory> filmCategories = iFilmCategory.findAll();
    }

}

