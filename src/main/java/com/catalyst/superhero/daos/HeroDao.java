package com.catalyst.superhero.daos;

import com.catalyst.superhero.entities.Hero;

import java.util.List;

/**
 * Created by dan on 11/28/15.
 */
public interface HeroDao {
    List<Hero> getHeroes();
}
