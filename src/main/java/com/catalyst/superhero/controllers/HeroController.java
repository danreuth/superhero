package com.catalyst.superhero.controllers;

import com.catalyst.superhero.entities.Hero;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by dan on 11/27/15.
 */
public class HeroController {

    @RequestMapping(value = "/heroes", method = RequestMethod.GET)
    public List<Hero> getHeroes() {
        return heroService.getHeroes();
    }

    @RequestMapping(value = "/heroes", method = RequestMethod.POST)
    public Hero createHero(@RequestBody Hero hero) {
        return null;
    }

    @RequestMapping(value = "/heroes", method = RequestMethod.PUT)
    public Hero updateHero(@RequestBody Hero hero) {
        return null;
    }
}
