package com.catalyst.superhero.services.impl;

import com.catalyst.superhero.daos.HeroDao;
import com.catalyst.superhero.entities.Hero;
import com.catalyst.superhero.services.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dan on 11/28/15.
 */
@Service
public class HeroServiceImpl implements HeroService
{
    @Autowired
    private HeroDao heroDao;

    public void setHeroDao(HeroDao heroDao) {
        this.heroDao = heroDao;
    }

    public List<Hero> getHeroes() {
        return heroDao.getHeroes();
    }
}
