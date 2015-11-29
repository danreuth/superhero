package com.catalyst.superhero.services;

import com.catalyst.superhero.entities.Hero;
import com.catalyst.superhero.exceptions.ValidationError;

import java.util.List;

/**
 * Created by dan on 11/28/15.
 */
public interface HeroService {
    List<Hero> getHeroes();
    Hero createHero(Hero hero) throws ValidationError;
}
